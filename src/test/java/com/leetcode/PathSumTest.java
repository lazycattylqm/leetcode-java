package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PathSumTest {
    @Test
    void test_case_1() {
        TreeNode root = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node13 = new TreeNode(13);
        TreeNode node4_t = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        root.left = node4;
        root.right = node8;
        node4.left = node11;
        node8.left = node13;
        node8.right = node4_t;
        node11.left = node7;
        node11.right = node2;
        node4_t.left = node5;
        node4_t.right = node1;
        List<List<Integer>> lists = new PathSum().pathSum(root, 22);
        System.out.println(lists);
    }

    @Test
    void test_case_2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(-3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(-2);
        TreeNode node6 = new TreeNode(-1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node3.left = node6;

        List<List<Integer>> lists = new PathSum().pathSum(root, -1);
        System.out.println(lists);
    }
}
