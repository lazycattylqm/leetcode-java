package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthLargest {

  private List<Integer> list = new ArrayList<>();
  private int k = 0;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    list.addAll(Arrays.stream(nums).boxed().toList());
  }

  public int add(int val) {
    list.add(val);
    return list
      .stream()
      .sorted((a, b) -> b - a)
      .skip(k - 1)
      .findFirst()
      .orElse(0);
  }
}
