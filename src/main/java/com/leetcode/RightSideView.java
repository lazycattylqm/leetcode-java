package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.right != null){
            queue.add(root.right);
        }

        Queue<TreeNode> temp = new LinkedList<>();
        while (!queue.isEmpty()){

            TreeNode poll = queue.poll();
            if(poll != null){
                if (poll.left != null) {
                    temp.add(poll.left);
                }
                if (poll.right != null) {
                    temp.add(poll.right);
                }
            }
            if (queue.isEmpty()) {
                if (poll != null) {
                    result.add(poll.val);
                }
                queue.addAll(temp);
                temp.clear();
            }
        }

        return result;
    }
}
