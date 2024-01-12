package com.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public int countWords(String[] words1, String[] words2){
        List<String> list = Arrays.stream(words1)
                .collect(Collectors.toMap(v -> v, v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        List<String> list1 = Arrays.stream(words2)
                .collect(Collectors.toMap(v -> v, v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        return (int) list.stream().filter(list1::contains).count();

    }
}
