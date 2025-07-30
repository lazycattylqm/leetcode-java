package com.leetcode;

import org.junit.jupiter.api.Test;

public class LongestSubarrayTest {

  @Test
  void case_1() {
    LongestSubarray longestSubarray = new LongestSubarray();
    int[] nums = { 1, 2, 3, 4, 5 };
    int result = longestSubarray.longestSubarray(nums);
    assert result == 1 : "Expected 1 but got " + result;
  }

}
