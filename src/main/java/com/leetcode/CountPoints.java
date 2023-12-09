package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountPoints {
    public int countPoints(String rings) {
        Map<String, Set<String>> map = new HashMap<>();
        while (!rings.isEmpty()) {
            String index = rings.substring(0, 2);
            String color = index.substring(0, 1);
            String number = index.substring(1);
            map.computeIfAbsent(number, k -> new HashSet<>());
            map.get(number).add(color);

            rings = rings.substring(2);
        }

        int count = ((int) map.entrySet()
                .stream()
                .map(v -> v.getValue())
                .filter(v -> v.size() == 3)
                .count());

        return count;
    }
}
