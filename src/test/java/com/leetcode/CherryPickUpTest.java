package com.leetcode;

import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;

import static org.junit.jupiter.api.Assertions.*;

class CherryPickUpTest {

    CherryPickUp s = new CherryPickUp();

    @Test
    void cherryPickup() {
        int[][] grid = {
            {0, 1, -1},
            {1, 0, -1},
            {1, 1,  1}
        };
        int i = s.cherryPickup(grid);
        assertSame(5, i);
    }
}