package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestAlternatingSubarrayTest {

    LongestAlternatingSubarray solution = new LongestAlternatingSubarray();
    @Test
    void longestAlternatingSubarray() {
        System.out.println(solution.longestAlternatingSubarray(new int[]{3, 2, 5, 4}, 5));
    }
}