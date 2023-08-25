package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountVowelStringsTest {
  @Test
  void test_case_1() {
    int n = 1;
    int expected = 5;
    int actual = new CountVowelStrings().countVowelStrings(n);
    assertEquals(expected, actual);
  }

  @Test
  void test_case_2() {
    int n = 2;
    int expected = 15;
    int actual = new CountVowelStrings().countVowelStrings(n);
    assertEquals(expected, actual);
  }

  @Test
  void test_case_3() {
    int n = 33;
    int expected = 66045;
    int actual = new CountVowelStrings().countVowelStrings(n);
    assertEquals(expected, actual);
  }
}
