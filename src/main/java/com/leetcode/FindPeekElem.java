package com.leetcode;

public class FindPeekElem {
  public int findPeakElement(int[] nums) {
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
