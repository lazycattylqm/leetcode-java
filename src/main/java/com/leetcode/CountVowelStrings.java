package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountVowelStrings {
  public int countVowelStrings(int n) {
    List<Integer> dp = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      dp.add(1);
    }
    for (int i = 1; i < n; i++) {
      List<Integer> temp = new ArrayList<>();
      for (int j = 0; j < 5; j++) {
        int sum = 0;
        for (int k = 0; k <= j; k++) {
          sum += dp.get(k);
        }
        temp.add(sum);
      }
      dp = temp;
    }
    return dp.stream().mapToInt(Number::intValue).sum();
  }
}
