package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CherryPickUpTest {

  CherryPickUp s = new CherryPickUp();

  @Test
  void cherryPickup() {
    int[][] grid = { { 0, 1, -1 }, { 1, 0, -1 }, { 1, 1, 1 } };
    int i = s.cherryPickup(grid);
    assertSame(4, i);
  }
}
