package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxSum {
    public int maximumSum(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toMap(this::sumDig, v -> {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(v);
                    return list;
                }, (a, b) -> {
                    if (a.size() < 2) {
                        a.addAll(b);
                    }
                    return a;
                }))
                .values()
                .stream()
                .filter(integers -> integers
                        .size() == 2)
                .map(integers -> integers
                        .stream()
                        .reduce(0, Integer::sum))
                .max(Integer::compareTo)
                .orElse(-1);
    }

    protected int sumDig(int v) {
        int sum = 0;
        int temp = v;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
