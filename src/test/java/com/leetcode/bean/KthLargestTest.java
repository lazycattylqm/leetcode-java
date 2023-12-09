package com.leetcode.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.leetcode.KthLargest;

public class KthLargestTest {

  @Test
  void case_1() {
    int[] nums = { 4, 5, 8, 2 };
    KthLargest kthLargest = new KthLargest(3, nums);
    assertSame(4, kthLargest.add(3));
    assertSame(5, kthLargest.add(5));
    assertSame(5, kthLargest.add(10));
    assertSame(8, kthLargest.add(9));
    assertSame(8, kthLargest.add(4));
  }

}
