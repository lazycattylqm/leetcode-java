package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        pathSumSub(root, targetSum, 0, path, result);
        return result;
    }

    public void pathSumSub(TreeNode current, int targetSum, int tempSum, Stack<Integer> path,
            List<List<Integer>> paths) {
        if (current == null) {


            return;
        }
        int val = current.val;
        path.add(val);
        Integer sum = path.stream()
                .reduce((a, b) -> a + b)
                .orElse(0);
        if (sum == targetSum && current.left == null && current.right == null) {
            List<Integer> integers = path.stream()
                    .toList();
            paths.add(integers);
            if (!path.empty()) {
                path.pop();
            }
            return;
        }

        pathSumSub(current.left, targetSum, sum, path, paths);
        pathSumSub(current.right, targetSum, sum, path, paths);
        if (!path.empty()) {
            path.pop();
        }

    }
}
