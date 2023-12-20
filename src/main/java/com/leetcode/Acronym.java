package com.leetcode;

import java.util.List;

public class Acronym {

  public boolean isAcronym(List<String> words, String s) {
    if (s.length() != words.size()) {
      return false;
    }
    return words
      .stream()
      .map(v -> v.substring(0, 1))
      .reduce("", (a, b) -> a + b)
      .equals(s);
  }
}
