package com.leetcode.bean;

import com.leetcode.DigitCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCountTest {

    @Test
    public void test_case_1() {
        String num = "1210";
        boolean expected = true;
        boolean actual = new DigitCount().digitCount(num);
        assertEquals(expected, actual);
    }

    @Test
    public void test_case_2() {
        String num = "030";
        boolean expected = false;
        boolean actual = new DigitCount().digitCount(num);
        assertEquals(expected, actual);
    }
}
