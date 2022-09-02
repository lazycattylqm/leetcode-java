package com.leetcode;

import java.util.Arrays;

public class ArraySearch {
    public boolean search(int[] nums, int target) {
        return Arrays.stream(nums)
                .anyMatch(val -> val == target);
    }

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;

            }

        }
        return nums[start];
    }

    public int findMinIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            }
        }
        return start;
    }

    public int search2(int[] nums, int target) {
        int minIndex = findMinIndex(nums);
        int minValue = nums[minIndex];
        if (target < minValue) {
            return -1;
        }
        int endArrValue = nums[nums.length - 1];
        if (target == endArrValue) {
            return nums.length - 1;
        }
        if (target==nums[0]) {
            return 0;
        }
        if (target == minValue) {
            return minIndex;
        }
        int startValue = nums[0];
        int endValue = nums[nums.length - 1];
        if (target >= startValue) {
            int startIndex = 0;
            int endIndex = minIndex - 1;
            int resultIndex = -1;
            while (startIndex < endIndex) {
                int mid = (startIndex + endIndex) / 2;
                if (nums[mid] == target) {
                    resultIndex = mid;
                    break;
                }
                if (nums[mid] < target) {
                    startIndex = mid + 1;
                }
                if (nums[mid] > target) {
                    endIndex = mid;
                }
            }
            return resultIndex;
        }
        if (target <= endValue) {
            int startIndex = minIndex;
            int endIndex = nums.length - 1;
            int resultIndex = -1;
            while (startIndex < endIndex) {
                int mid = (startIndex + endIndex) / 2;
                if (nums[mid] == target) {
                    resultIndex = mid;
                    break;
                }
                if (nums[mid] < target) {
                    startIndex = mid + 1;
                }
                if (nums[mid] > target) {
                    endIndex = mid;
                }
            }
            return resultIndex;

        }
        return -1;
    }
}
