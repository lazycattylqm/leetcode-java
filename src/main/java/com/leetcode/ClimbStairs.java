package com.leetcode;

public class ClimbStairs {

  public int climbStairs(int n) {
    int first = 1;
    int second = 2;
    int currnet = 0;
    if (n == 1) {
      return first;
    }
    if (n == 2) {
      return second;
    }
    for (int i = 3; i <= n; i++) {
      currnet = first + second;
      first = second;
      second = currnet;
    }
    return currnet;
  }
}
