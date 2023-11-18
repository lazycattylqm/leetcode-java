package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumTest {

    MaxSum solution = new MaxSum();
    @Test
    void maximumSum() {
        int i = solution.maximumSum(new int[]{18, 43, 36, 13, 7});
        Assertions.assertSame(54, i);
    }
}