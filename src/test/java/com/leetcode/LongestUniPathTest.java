package com.leetcode;

import org.junit.jupiter.api.Test;

public class LongestUniPathTest {
    @Test
    void case_1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(5);
        LongestUniPath longestUniPath = new LongestUniPath();
        int i = longestUniPath.longestUnivaluePath(root);
        System.out.println(i);
    }

    @Test
    void case_2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        LongestUniPath longestUniPath = new LongestUniPath();
        int i = longestUniPath.longestUnivaluePath(root);
        System.out.println(i);
    }
}
