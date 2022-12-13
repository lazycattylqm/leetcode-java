package com.leetcode;

import java.util.Arrays;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        return Arrays.stream(sentence.split(""))
                .distinct()
                .count() == 26;
    }
}
