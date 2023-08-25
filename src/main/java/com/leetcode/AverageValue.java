package com.leetcode;

import java.util.Arrays;

public class AverageValue {
    public int averageValue(int[] nums) {
        double asDouble = Arrays.stream(nums)
                .boxed()
                .filter(v -> v % 3 == 0)
                .filter(v -> v % 2 == 0)
                .mapToInt(v -> v)
                .average()
                .orElse(0);
        return (int) asDouble;
    }
}
