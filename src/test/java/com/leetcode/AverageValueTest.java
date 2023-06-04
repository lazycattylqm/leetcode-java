package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageValueTest {
    @Test
    void test() {
        int i = new AverageValue().averageValue(new int[]{1, 3, 6, 10, 12, 15});
        Assertions.assertEquals(9, i);
    }

    @Test
    void test2(){
        int i = new AverageValue().averageValue(new int[]{1, 2, 4, 7, 10});
        Assertions.assertEquals(0, i);
    }
}
