package com.leetcode;

public class MyProblem {

    public int solution(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        if (nums[0] == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                dp[i] = dp[i - 1];
            } else if (nums[i] == 1) {
                dp[i] = dp[i - 1] + dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 1] + dp[i - 1];
            }
        }
        return dp[nums.length - 1];
    }

}
