package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumDifferentIntegersTest {
    @Test
    public void test_case_1(){
        int count = new NumDifferentIntegers().numDifferentIntegers("a123bc34d8ef34");
        Assertions.assertEquals(3, count);
    }

    @Test
    public void test_case_2(){
        int count = new NumDifferentIntegers().numDifferentIntegers("a1b01c001");
        Assertions.assertEquals(1, count);
    }

    @Test
    public void test_case_3(){
        int count = new NumDifferentIntegers().numDifferentIntegers("167278959591294");
        Assertions.assertEquals(1, count);
    }
}
