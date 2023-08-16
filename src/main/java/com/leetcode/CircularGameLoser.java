package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CircularGameLoser {
    public int[] circularGameLosers(int n, int k) {
        List<Integer> init = init(n);
        List<Integer> cached = new ArrayList<>();
        int round = 1;
        runGame(init, cached, round, k, n);
        return reject(init, cached);
    }

    private List<Integer> init(int n) {
        return Stream.iterate(1, v -> v <= n, v -> v + 1).toList();
    }

    private void runGame(List<Integer> init, List<Integer> cached, int round, int k, int n) {
        cached.add(1);
        int initSeed = 0;
        while (true) {
            int seed = k * round;
            int index = (initSeed + seed) % n;
            Integer i = init.get(index);
            if (!cached.contains(i)) {
                cached.add(i);
                round++;
                initSeed=index;
            } else {
                return;
            }
        }

    }

    private int[] reject(List<Integer> src, List<Integer> check) {
        return src.stream().filter(v -> !check.contains(v)).mapToInt(v -> v).toArray();
    }
}
