package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinOperationsTest {

    @Test
    public void case_1() {
        String s = "0100";
        int result = new MinOperations().minOperations(s);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void case_2() {
        String s = "10";
        int result = new MinOperations().minOperations(s);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case_3() {
        String s = "1111";
        int result = new MinOperations().minOperations(s);
        Assertions.assertEquals(2, result);
    }
}
