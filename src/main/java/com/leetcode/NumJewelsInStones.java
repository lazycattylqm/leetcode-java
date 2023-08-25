package com.leetcode;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        String jewelsRegex = "[" + jewels + "]";
        String s = stones.replaceAll(jewelsRegex, "");
        return stones.length() - s.length();
    }
}
