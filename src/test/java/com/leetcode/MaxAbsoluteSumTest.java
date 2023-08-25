package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAbsoluteSumTest {

    @Test
    void maxAbsoluteSum() {
        MaxAbsoluteSum maxAbsoluteSum = new MaxAbsoluteSum();
        int i = maxAbsoluteSum.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4});
        assertEquals(5, i);

    }
}