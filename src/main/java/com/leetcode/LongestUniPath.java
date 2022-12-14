package com.leetcode;

public class LongestUniPath {
    private int res = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int i = calcPath(root);
        return Math.max(i, res);
    }

    public int calcPath(TreeNode current) {
        if (current == null) {
            return 0;
        }
        int value = current.val;
        TreeNode leftNode = current.left;
        TreeNode rightNode = current.right;
        int leftMaxRes = calcPath(leftNode);
        int rightMaxRes = calcPath(rightNode);
        int leftPath = 0;
        int rightPath = 0;
        if (leftNode != null) {
            if (leftNode.val == value) {
                leftPath = leftMaxRes + 1;
            }
        }
        if (rightNode != null) {
            if (rightNode.val == value) {
                rightPath = rightMaxRes + 1;
            }
        }
        res = Math.max(res, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }
}
