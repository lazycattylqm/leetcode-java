package com.leetcode;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSimilarItem {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        return Stream.concat(Stream.of(items1), Stream.of(items2))
                .collect(Collectors.toMap(v -> v[0], v -> v[1], Integer::sum))
                .entrySet()
                .stream()
                .map(v -> List.of(v.getKey(), v.getValue()))
                .sorted(Comparator.comparingInt(a -> a.get(0)))
                .toList();
    }
}
