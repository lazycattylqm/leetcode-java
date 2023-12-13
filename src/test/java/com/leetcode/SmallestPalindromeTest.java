package com.leetcode;

import org.junit.jupiter.api.Test;

public class SmallestPalindromeTest {

  SmallestPalindrome solution = new SmallestPalindrome();

  @Test
  void testMakeSmallestPalindrome() {
    // do testMakeSmallestPalindrome
    // input is egcfe
    // output is efcfe
    // expected output is efcfe
    String input = "egcfe";
    String output = solution.makeSmallestPalindrome(input);
    String expectedOutput = "efcfe";
    assert output.equals(expectedOutput);
  }
}
