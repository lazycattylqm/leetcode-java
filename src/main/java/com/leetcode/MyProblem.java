package com.leetcode;

public class MyProblem {
    /**
     * 某工厂用0，1，2代表出厂检测步骤，分三步， 0 表示第一步1 表示第二步， 2 表示第三步。需要按照0在1前执行，1在2前执行的顺序执行。
     * 现在给出一个数组，值表示当前人员可以执行哪一步，请给出全部的组合数
     *
     */
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
