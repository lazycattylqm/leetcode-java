package com.leetcode;

public class MinTaps {
    public int minTaps(int n, int[] ranges) {
        int pre = 0;
        int rightMax = 0;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = i + ranges[i];
            if (left <= pre) {
                if (right>rightMax) {
                    rightMax = right;
                    if (rightMax >= i) {
                        pre = rightMax;
                        count++;
                    }
                }
            }

        }
        if (rightMax >= n) {
            return count;
        }
        return -1;
    }
}
