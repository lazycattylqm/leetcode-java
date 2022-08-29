package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BTreeWidthTest {
    @Test
    void test_case_1() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        TreeNode treeNode1 = new TreeNode(2, null, new TreeNode(9));
        root.left = treeNode;
        root.right = treeNode1;
        int i = new BTreeWidth().widthOfBinaryTree(root);
        Assertions.assertEquals(4, i);
    }

    @Test
    void test_case_2() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode.left = treeNode3;
        treeNode.right = treeNode2;
        treeNode3.left = treeNode5;
        treeNode2.right = treeNode9;
        treeNode5.left = treeNode6;
        treeNode9.left = treeNode7;
        int i = new BTreeWidth().widthOfBinaryTree(treeNode);
        Assertions.assertEquals(7, i);
    }
}
