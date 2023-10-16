package com.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Long> collect = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(v -> v)
                .toArray();
    }

    public int singleNumber2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(v -> v)
                .findFirst()
                .getAsInt();

    }
}
