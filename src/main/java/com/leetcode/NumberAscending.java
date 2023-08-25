package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class NumberAscending {
    public boolean areNumbersAscending(String s) {
        List<Integer> integers = Arrays.stream(s.replaceAll("[a-zA-Z]", "")
                        .split(" "))
                .filter(x -> !x.isEmpty())
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
        return isAscending(integers);

    }

    private boolean isAscending(List<Integer> integers) {
        for (int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i) >= integers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
