package com.leetcode;

public class FindPeekElem {
  public int findPeakElement(int[] nums) {
    // 峰值元素是指其值严格大于左右相邻值的元素。
    // 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
    // 你可以假设 nums[-1] = nums[n] = -∞ 。
    // 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
    // 二分查找
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = (left + right) >>> 1;
      if (nums[mid] > nums[mid + 1]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;

  }

  public int findPeakElement2(int[] nums) {
    
    if(nums.length==1){
      return 0;
    }
    for(int i =1; i<=nums.length-2;i++) {
      if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
        return i;
      }
    }
    return -1;
  }

}
