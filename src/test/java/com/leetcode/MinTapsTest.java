package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinTapsTest {
    @Test
    public void case_1() {
        MinTaps minTaps = new MinTaps();
        int i = minTaps.minTaps(5, new int[]{3, 4, 1, 1, 0, 0});
        Assertions.assertEquals(1, i);
    }

    @Test
    public void case_3() {
        MinTaps minTaps = new MinTaps();
        int i = minTaps.minTaps(3, new int[]{0,0,0,0});
        Assertions.assertEquals(-1, i);
    }

    @Test
    public void case_2() {
        MinTaps minTaps = new MinTaps();
        int i = minTaps.minTaps(7, new int[]{1,2,1,0,2,1,0,1});
        Assertions.assertEquals(3, i);
    }
}
