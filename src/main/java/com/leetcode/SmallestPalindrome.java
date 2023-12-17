package com.leetcode;

public class SmallestPalindrome {

  public String makeSmallestPalindrome(String s) {
    char[] charArray = s.toCharArray();
    int left = 0;
    int right = charArray.length - 1;
    while (left < right) {
      if (charArray[left] != charArray[right]) {
        char min = ((char) Math.min(charArray[left], charArray[right]));
        charArray[left] = min;
        charArray[right] = min;
      }
      left++;
      right--;
    }
    return new String(charArray);
  }
}
