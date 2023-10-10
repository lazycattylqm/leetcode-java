package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDistance {
    public int sumDistance(int[] nums, String s, int d) {
        List<Integer> steps = Arrays.stream(s.split(""))
                .map(v -> {
                    if (v.equals("R")) {
                        return 1;
                    } else {
                        return -1;
                    }
                }).map(v -> v * d)
                .toList();
        List<Integer> finalPos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            finalPos.add(nums[i] + steps.get(i));
        }
        return calcResult(finalPos);

    }

    private int calcResult(List<Integer> values) {
        List<Integer> reduceList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        values.sort(Integer::compareTo);
        reduceList.addAll(values);
        ArrayList<Integer> tmp1 = new ArrayList<>();
        for (int i = 1; i < reduceList.size(); i++) {
            tmp1.add(reduceList.get(i) - reduceList.get(i - 1));
        }
        while (true) {
            if (tmp1.size() == 1) {
                sumList.add(tmp1.get(0));
                break;
            }

            int sum = tmp1.stream()
                    .mapToInt(v -> v)
                    .sum();
            sumList.add(sum);
            ArrayList<Integer> tmp2 = new ArrayList<>();
            for (int i = 1; i < tmp1.size(); i++) {
                tmp2.add(tmp1.get(i) + tmp1.get(i - 1));
            }
            tmp1.clear();
            tmp1.addAll(tmp2);

        }

        return sumList.stream()
                .mapToInt(v -> v)
                .sum();

    }
}
