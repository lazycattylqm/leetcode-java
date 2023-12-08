package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxTaxiEarnings {
    public long maxTaxiEarnings(int n, int[][] rides) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        Arrays.sort(rides, Comparator.comparingInt(a -> a[1]));
        Map<Integer, List<int[]>> collect = Arrays.stream(rides)
                .collect(Collectors.groupingBy(a -> a[1]));
        for (int i = 1; i <= n; i++) {
            dp.add(dp.get(i - 1));
            collect.getOrDefault(i, Collections.emptyList()).forEach(v->{
                int start = v[0];
                int end = v[1];
                int tip = v[2];
                int money = end -start + tip;
                int lastMoney = dp.get(start);
                int currentMoney = dp.get(end);
                int newMoney = lastMoney + money;
                dp.set(end, Math.max(currentMoney, newMoney));
            });

        }
        return dp.stream()
                .max(Integer::compareTo)
                .orElse(0);

    }




}
