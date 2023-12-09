package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPointsTest {

    @Test
    void countPoints() {
        int i = new CountPoints().countPoints("B0R0G0R9R0B0G0");
        assertSame(1, i);
    }
}