package com.leetcode;

public class MinTaps {
    public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
          int left = Math.max(0, i - ranges[i]);
          int right = Math.min(n, i + ranges[i]);
          dp[left] = Math.max(dp[left], right);
        }
        int pre = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
            if (i == pre) {
                count++;
                pre = max;
            }
        }
        if (pre >= n) {
            return count;
        }
        return -1;
    }
}
