package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqStack {
    private List<Integer> stack;
    private Map<Integer, Integer> freqMap;

    public FreqStack() {
        stack = new ArrayList<>();
        freqMap = new HashMap<>();
    }

    public void push(int val) {
        stack.add(val);
        freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
    }

    public int pop() {
        Integer maxFreq = freqMap.values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0);
        List<Integer> collect = freqMap.entrySet()
                .stream()
                .filter(val -> val.getValue()
                        .equals(maxFreq))
                .map(Map.Entry::getKey)
                .toList();
        int index = stack.size() - 1;
        boolean find = false;
        for (; index >= 0; index--) {
            if (collect.contains(stack.get(index))) {
                find = true;
                break;
            }
        }
        if (find) {
            int val = stack.get(index);
            stack.remove(index);
            freqMap.put(val, freqMap.get(val) - 1);
            return val;
        }
        return -1;
    }

}
