package com.leetcode;

public class LongestSubarray {
  public int longestSubarray(int[] nums) {
    int maxValue = nums[0];
    int ans = 1;
    int cnt = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxValue) {
        ans = cnt = 1;
        maxValue = nums[i];
      } else if (nums[i] < maxValue) {
        cnt = 0;
      } else if (nums[i] == maxValue) {
        cnt++;
      }
      ans = Math.max(cnt, ans);
    }
    return ans;

  }

}
