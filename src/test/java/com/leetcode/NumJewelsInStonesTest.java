package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumJewelsInStonesTest {
    @Test
    void test_case_1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int i = new NumJewelsInStones().numJewelsInStones(jewels, stones);
        Assertions.assertEquals(3, i);
    }

    @Test
    void test_case_2() {
        String jewels = "z";
        String stones = "ZZ";
        int i = new NumJewelsInStones().numJewelsInStones(jewels, stones);
        Assertions.assertEquals(0, i);
    }
}
