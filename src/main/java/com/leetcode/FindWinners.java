package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWinners {
    public List<List<Integer>> findWinners(int[][] matches) {
        final int winnerIdx = 0;
        final int loserIdx = 1;
        Map<Integer, Integer> map = Arrays.stream(matches)
                .map(v -> v[0])
                .reduce(new HashMap<>(), (m, v) -> {
                    m.put(v, 0);
                    return m;
                }, (a, b) -> a);
        Arrays.stream(matches).map(v->v[1]).forEach(v->{
            map.put(v, map.getOrDefault(v, 0)+1);
        });
        List<Integer> winner = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 0)
                .map(Map.Entry::getKey)
                .sorted(Integer::compareTo)
                .toList();
        List<Integer> list2 = map.entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted(Integer::compareTo)
                .toList();
        return List.of(winner, list2);
    }
}
