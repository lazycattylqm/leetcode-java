package com.leetcode;

public class MaxAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int i = maxSum(nums);
        int i1 = minSum(nums);
        return Math.max(Math.abs(i), Math.abs(i1));
    }

    private int maxSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    private int minSum(int[] nums) {
        int minSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }
}
