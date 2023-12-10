package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClimbStairsTest {

  ClimbStairs solution = new ClimbStairs();

  // generate test which n is 3 and assert as 3
  @Test
  void testClimbStairs() {
    int n = 3;
    int expected = 3;
    int actual = solution.climbStairs(n);
    assertEquals(expected, actual);
  }
}
