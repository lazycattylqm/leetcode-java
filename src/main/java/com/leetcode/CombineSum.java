package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<Integer> integers = Arrays.stream(candidates)
                .boxed()
                .sorted()
                .toList();
        List<Integer> result = new ArrayList<>();
        getCombineSum(integers, target, result, 0);
        return null;
    }

    public void getCombineSum(List<Integer> candidates, int target, List<Integer> result, int tempSum) {
        for (Integer val : candidates) {
            if (tempSum + val == target) {
                System.out.println(result);
                System.out.println(val);
            }
            if (tempSum + val < target) {
                result.add(val);
                getCombineSum(candidates, target, result, tempSum + val);
            }
            if(tempSum + val > target) {
                result.remove(result.size() -1);
                return;
            }

        }
    }
}
