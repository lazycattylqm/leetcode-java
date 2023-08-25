package com.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckIfPangram {
  public boolean checkIfPangram(String sentence) {
    return Arrays.stream(sentence.split("")).collect(Collectors.toSet()).size() == 26;
  }
}
