package com.leetcode;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class VowelStrings {

  public int vowelStrings(String[] words, int left, int right) {
    return ((int) Arrays.stream(words)
            .skip(left)
            .limit(right + 1)
            .filter(this::checkString)
            .count());
  }

  private boolean checkString(String word) {
    if (word.length()==1) {
        return "aeiou".contains(word);
    }
    if (word.length()==0) {
      return false;
    }
    Pattern pattern = Pattern.compile("^[aeiou](\\w)*[aeiou]$");
    return pattern.matcher(word).find();
  }

}
