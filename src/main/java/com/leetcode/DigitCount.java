package com.leetcode;

import java.util.*;

public class DigitCount {
    public boolean digitCount(String num) {
        List<Integer> index = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        String[] split = num.split("");
        for (int i = 0; i < split.length; i++) {
            map.put(i, Integer.parseInt(split[i]));
        }
        map.forEach((k, v) -> {
            index.add(k);
            values.add(v);

        });
        for (Integer integer : index) {
            Integer count = map.get(integer);
            Long count1 = values.stream()
                    .filter(val -> Objects.equals(val, integer))
                    .count();
            if (count1.intValue() != count) {
                return false;
            }
        }
        return true;
    }
}
