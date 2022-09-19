package com.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencySort {
    public static void main(String[] args) {
        final FrequencySort frequencySort = new FrequencySort();
        final int[] ints = frequencySort.frequencySort(new int[]{1, 1, 1, 2, 2, 2, 3});
    }

    public int[] frequencySort(int[] nums) {

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(val -> val, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    if (a.getValue()
                            .equals(b.getValue())) {
                        return b.getKey() - a.getKey();
                    }
                    return ((int) (a.getValue() - b.getValue()));

                })
                .flatMap(val -> Stream.generate(val::getKey)
                        .limit(val.getValue()))
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
