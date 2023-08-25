package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RightSideViewTest {
    RightSideView solution = new RightSideView();

    @Test
    void test_case() {
        TreeNode treeNode1 = new TreeNode();
        treeNode1.val = 1;
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode2.left = treeNode4;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        List<Integer> integers = solution.rightSideView(treeNode1);
        System.out.println(integers);

    }
}
