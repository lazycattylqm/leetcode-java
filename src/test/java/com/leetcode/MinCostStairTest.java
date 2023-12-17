package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostStairTest {
    MinCostStair solution = new MinCostStair();

    // generate test
    // given input as  [10,15,20]
    // when call the method minCostClimbingStairs
    // then the input should be 15
    @Test
    void minCostClimbingStairs() {
        int[] input = {10, 15, 20};
        int expected = 15;
        int actual = solution.minCostClimbingStairs(input);
        assertEquals(expected, actual);
    }

}