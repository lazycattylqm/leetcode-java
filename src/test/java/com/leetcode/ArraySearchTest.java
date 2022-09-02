package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraySearchTest {
    @Test
    @DisplayName("Search in Rotated Sorted Array min")
    void caseForSearchInRotatedSortedArrayMin_1() {
        ArraySearch arraySearch = new ArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = arraySearch.findMin(nums);
        System.out.println(min);
    }

    @Test
    @DisplayName("33. 搜索旋转排序数组")
    void case_1() {
        ArraySearch arraySearch = new ArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int i = arraySearch.search2(nums, 0);
        System.out.println(i);
    }

    @Test
    @DisplayName("33. 搜索旋转排序数组")
    void case_2() {
        ArraySearch arraySearch = new ArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int i = arraySearch.search2(nums, 3);
        System.out.println(i);
    }

    @Test
    @DisplayName("33. 搜索旋转排序数组")
    void case_3() {
        ArraySearch arraySearch = new ArraySearch();
        int[] nums = {1};
        int i = arraySearch.search2(nums, 0);
        System.out.println(i);
    }

    @Test
    @DisplayName("33. 搜索旋转排序数组")
    void case_4() {
        ArraySearch arraySearch = new ArraySearch();
        int[] nums = {1,3};
        int i = arraySearch.search2(nums, 3);
        System.out.println(i);
    }
}
