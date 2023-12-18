// FILEPATH: /Users/liqiming/Project/leetcode-java/src/test/java/com/leetcode/FindPeekElemTest.java

package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPeekElemTest {

  @Test
  void testFindPeakElement_example1() {
    FindPeekElem findPeekElem = new FindPeekElem();
    int[] nums = {1, 2, 3, 1};
    int result = findPeekElem.findPeakElement(nums);
    assertEquals(2, result);
  }

  @Test
  void testFindPeakElement_example2() {
    FindPeekElem findPeekElem = new FindPeekElem();
    int[] nums = {1, 2, 1, 3, 5, 6, 4};
    int result = findPeekElem.findPeakElement(nums);
    assertTrue(result == 1 || result == 5);
  }
}
