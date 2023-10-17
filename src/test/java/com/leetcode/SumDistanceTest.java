package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDistanceTest {

    @Test
    void case_1() {
        int[] nums = {-2,0,2};
        String s = "RLL";
        int d = 3;
        int expected = 8;
        int actual = new SumDistance().sumDistance(nums, s, d);
        assertEquals(expected, actual);
    }

    @Test
    void case_2() {
        int[] nums = {-10,-13,10,14,11};
        String s = "LRLLR";
        int d = 2;
        int expected = 215;
        int actual = new SumDistance().sumDistance(nums, s, d);
        assertEquals(expected, actual);
    }

}