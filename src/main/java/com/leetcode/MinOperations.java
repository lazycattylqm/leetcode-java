package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperations {

    public int minOperations(String s) {
        List<String> strings = Arrays.stream(s.split(""))
                .toList();
        int length = strings.size();
        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                even.add(strings.get(i));
                continue;
            }
            odd.add(strings.get(i));

        }
        int i1 = operations(even, "0") + operations(odd, "1");
        int i2 = operations(even, "1") + operations(odd, "0");

        return Math.min(i1, i2);
    }


    private int operations(List<String> strings, String target) {
        int count = 0;
        for (String s : strings) {
            if (!s.equals(target)) {
                count++;
            }
        }
        return count;
    }

}
