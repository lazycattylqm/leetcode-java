package com.leetcode;


import org.junit.jupiter.api.Test;

import java.util.List;

public class PermuteUniqueTest {
    @Test
    public void case_1() {
        PermuteUnique permuteUnique = new PermuteUnique();
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = permuteUnique.permuteUnique(nums);
        System.out.println(result);
    }

    @Test
    public void case_2() {
        PermuteUnique permuteUnique = new PermuteUnique();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permuteUnique.permuteUnique(nums);
        System.out.println(result);
    }
}
