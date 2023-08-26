package com.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeDis {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        List<int[]> list = Arrays.stream(intervals)
                .sorted((a, b) -> a[0] - b[0])
                .toList();

        int[] cur = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int[] next = list.get(i);
            if (cur[1] >= next[0]) {
                cur[1] = Math.max(cur[1], next[1]);
            } else {
                res.add(cur);
                cur = next;
            }
        }

        res.add(cur);
        return res.toArray(new int[res.size()][]);

    }
}