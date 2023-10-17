package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Rob {
    public int rob(TreeNode root) {
        Queue<TreeNode> queueOdd = new LinkedList<>();
        Queue<TreeNode> queueEven = new LinkedList<>();
        int sumOdd = 0;
        int sumEven = 0;
        queueOdd.add(root);
        while (!queueEven.isEmpty() || !queueOdd.isEmpty()) {
            TreeNode pollOdd = queueOdd.poll();
            if (pollOdd != null) {
                sumOdd+=pollOdd.val;
                if (pollOdd.left != null) {
                    queueEven.add(pollOdd.left);

                }
                if (pollOdd.right != null) {
                    queueEven.add(pollOdd.right);
                }
            }

            TreeNode pollEven = queueEven.poll();
            if (pollEven != null) {
                sumEven+=pollEven.val;
                if (pollEven.left != null) {
                    queueOdd.add(pollEven.left);
                }
                if (pollEven.right != null) {
                    queueOdd.add(pollEven.right);
                }
            }
        }
        return Math.max(sumEven, sumOdd);
    }
}
