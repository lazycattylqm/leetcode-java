package com.leetcode;

import java.util.ArrayList;
import java.util.List;
public class MinCostStair {
  public int minCostClimbingStairs(int[] cost) {
    List<Integer> dp = new ArrayList<>();
    dp.add(0);
    dp.add(0);

    for (int i = 2; i <= cost.length; i++) {
      int min = Math.min(dp.get(i - 1) + cost[i - 1], dp.get(i - 2) + cost[i - 2]);
      dp.add(min);
      // Math
    }

    return dp.getLast();
  }

}
