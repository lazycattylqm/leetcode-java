package com.leetcode;

import java.util.Arrays;

public class Hindex {

  public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int h = 0;
    for (int hIndex = citations.length - 1; hIndex >= 0; hIndex--) {
      if (citations[hIndex] > h) {
        h++;
      } else {
        break;
      }
    }
    return h;

  }

}
