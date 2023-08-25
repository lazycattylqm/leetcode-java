package com.leetcode;

public class GoodNodes {

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val);
    }

    private int dfs(TreeNode current, int max) {
        if (current == null) {
            return 0;
        }
        int count = 0;
        if (current.val >= max) {
            count++;
        }
        max = Math.max(max, current.val);
        count += dfs(current.left, max);
        count += dfs(current.right, max);
        return count;
    }
}
