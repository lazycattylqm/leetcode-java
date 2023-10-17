package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobTest {


    @Test
    void rob() {
        Rob rob = new Rob();
        TreeNode node0 = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node6 = new TreeNode(1);

        node0.left = node1;
        node0.right = node2;
        node1.right = node4;
        node2.right = node6;

        int rob1 = rob.rob(node0);
        assertEquals(7, rob1);


    }

    @Test
    void case_2() {
        TreeNode node = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node.left = node1;
        node1.left = node2;
        node2.left = node3;
        int rob = new Rob().rob(node);
        assertEquals(6, rob);
    }
}