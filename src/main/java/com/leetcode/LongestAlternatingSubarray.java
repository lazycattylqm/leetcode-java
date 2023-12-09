package com.leetcode;

public class LongestAlternatingSubarray {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int result =0;
        if (nums.length==0) {
            return result;
        }
        int current = nums[0];
        int init = current % 2;
        result = 0;
        int now =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>threshold) {
                result = 0;
            }
            int a = nums[i] % 2;
            if (a == init) {
                now=1;
                result = Math.max(result, now);
                init = a;
            } else {
                now++;
                result = Math.max(result, now);
                init = a;
            }
        }

        return result;

    }
}
