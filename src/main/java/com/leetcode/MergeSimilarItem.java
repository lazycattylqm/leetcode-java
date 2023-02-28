package com.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeSimilarItem {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] value : items1) {
            map.merge(value[0], value[1], Integer::sum);
        }

        for (int[] ints : items2) {
            map.merge(ints[0], ints[1], Integer::sum);
        }

        return map.entrySet()
                .stream()
                .map(entry -> List.of(entry.getKey(), entry.getValue()))
                .sorted((o1, o2) -> o1.get(0) - o2.get(0))
                .toList();


    }
}
