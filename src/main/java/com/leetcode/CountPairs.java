package com.leetcode;

import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort(Integer::compareTo);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum >= target) {
                right--;
            } else {
                count += right - left;
                left++;
            }
        }
        return count;
    }
}
