package com.leetcode;

public class FindTheArrayConcVal {
    public long findTheArrayConcVal(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        long sum = 0;
        while (low <= high) {
            if(low== high) {
                sum += nums[low];
            } else {
                String concat = String.valueOf(nums[low])
                        .concat(String.valueOf(nums[high]));
                Long l = Long.valueOf(concat);
                sum += l;
            }
            low++;
            high--;

        }
        return sum;

    }
}
