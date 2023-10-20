package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .reduce(new HashMap<String, List<String>>(), (acc, v) -> {
                    String key = Arrays.stream(v.split(""))
                            .sorted()
                            .reduce("", (a, b) -> a + b);
                    if (acc.containsKey(key)) {
                        acc.get(key)
                                .add(v);
                    } else {
                        acc.put(key, new ArrayList<>(List.of(v)));
                    }
                    return acc;
                }, (a, b) -> a)
                .values());

    }
}
