package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NearestValidPointTest {
    @Test
    public void case_1() {
        int[][] points = new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        final int x = 3;
        final int y = 4;
        final int i = new NearestValidPoint().nearestValidPoint(x, y, points);
        Assertions.assertEquals(2, i);
    }

    @Test
    public void case_2() {
        int[][] points = new int[][]{{3, 4}};
        final int x = 3;
        final int y = 4;
        final int i = new NearestValidPoint().nearestValidPoint(x, y, points);
        Assertions.assertEquals(0, i);
    }

    @Test
    public void case_3() {
        int[][] points = new int[][]{{2, 3}};
        final int x = 3;
        final int y = 4;
        final int i = new NearestValidPoint().nearestValidPoint(x, y, points);
        Assertions.assertEquals(-1, i);
    }
}
