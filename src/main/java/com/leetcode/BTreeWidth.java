package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class BTreeWidth {


    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxWidth = 1;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        maxWidth = Math.max(maxWidth, queue.size());
        boolean b = queue.stream()
                .anyMatch(Objects::nonNull);
        while (b) {
            List<TreeNode> treeNodes = queue.stream()
                    .flatMap(val -> {
                        if (val == null) {
                            return Stream.of(null, null);
                        }
                        return Stream.of(val.left, val.right);
                    })
                    .toList();


            maxWidth = Math.max(maxWidth, sizeOfList(treeNodes));
            queue = treeNodes;
            b = queue.stream()
                    .anyMatch(Objects::nonNull);
        }
        return maxWidth;
    }

    private int sizeOfList(List<TreeNode> treeNodes) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < treeNodes.size(); i++) {
            if (treeNodes.get(i) != null) {
                start = i;
                break;
            }
        }
        for (int i = treeNodes.size() - 1; i >= 0; i--) {
            if (treeNodes.get(i) != null) {
                end = i;
                break;
            }
        }
        if (start == 0 && end == 0) {
            return 0;
        }
        return end - start + 1;
    }


}
