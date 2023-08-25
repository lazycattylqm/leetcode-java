package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberAscendingTest {
    @Test
    public void test_case_1(){
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        NumberAscending numberAscending = new NumberAscending();
        boolean result = numberAscending.areNumbersAscending(s);
        Assertions.assertTrue(result);
    }

    @Test
    public void test_case_2(){
        String s = "hello world 5 x 5";
        NumberAscending numberAscending = new NumberAscending();
        boolean result = numberAscending.areNumbersAscending(s);
        Assertions.assertFalse(result);
    }

    @Test
    public void test_case_3(){
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        NumberAscending numberAscending = new NumberAscending();
        boolean result = numberAscending.areNumbersAscending(s);
        Assertions.assertFalse(result);
    }

    @Test
    public void test_case_4(){
        String s = "4 5 11 26";
        NumberAscending numberAscending = new NumberAscending();
        boolean result = numberAscending.areNumbersAscending(s);
        Assertions.assertTrue(result);
    }
}
