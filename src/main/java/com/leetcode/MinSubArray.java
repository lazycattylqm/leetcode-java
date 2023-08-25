package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MinSubArray {
    class Solution {
        public int minSubarray(int[] nums, int p) {
            int k = 0;
            for (int x : nums) {
                k = (k + x) % p;
            }
            if (k == 0) {
                return 0;
            }
            Map<Integer, Integer> last = new HashMap<>();
            last.put(0, -1);
            int n = nums.length;
            int ans = n;
            int cur = 0;
            for (int i = 0; i < n; ++i) {
                cur = (cur + nums[i]) % p;
                int target = (cur - k + p) % p;
                if (last.containsKey(target)) {
                    ans = Math.min(ans, i - last.get(target));
                }
                last.put(cur, i);
            }
            return ans == n ? -1 : ans;
        }
    }

}
