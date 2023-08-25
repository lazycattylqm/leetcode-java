package com.leetcode;

import org.junit.jupiter.api.Test;

public class CircularGameLoserTest {
    CircularGameLoser solution = new CircularGameLoser();

    @Test
    void init() {
        int[] ints = solution.circularGameLosers(5, 2);
        System.out.println(ints);
    }
}
