package com.leetcode;

import java.util.Arrays;

public class NumDifferentIntegers {

    public int numDifferentIntegers(String word) {

        long count = Arrays.stream(word.split("[a-zA-Z]+"))
                .filter(val -> !val.isBlank())
                .map(val -> val.replaceAll("^0+", ""))
                .distinct()
                .count();
        int integer = Integer.valueOf((int) count)
                .intValue();
        return integer;
    }
}
