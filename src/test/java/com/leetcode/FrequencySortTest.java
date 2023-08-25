package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FrequencySortTest {
    @Test
    void case_1() {
        final int[] ints = new FrequencySort().frequencySort(new int[]{1, 1, 2, 2, 2, 3});
        Arrays.stream(ints)
                .forEach(System.out::println);
    }

    @Test
    void case_2() {
        final int[] ints = new FrequencySort().frequencySort(new int[]{2, 3, 1, 3, 2});
        Arrays.stream(ints)
                .forEach(System.out::println);
    }

    @Test
    void case_3() {
        final int[] ints = new FrequencySort().frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});
        Arrays.stream(ints)
                .forEach(System.out::println);
    }
}
