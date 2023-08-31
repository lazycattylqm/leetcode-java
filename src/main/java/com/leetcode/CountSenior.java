package com.leetcode;

import java.util.Arrays;

public class CountSenior {
    public int countSeniors(String[] details) {
        long count = Arrays.stream(details)
                .map(v -> v.substring(11, 13))
                .mapToInt(Integer::parseInt)
                .filter(v -> v > 60)
                .count();

        return (int) count;

    }
}
