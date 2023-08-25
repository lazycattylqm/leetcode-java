package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class ReOrderSpace {
    public static void main(String[] args) {
        final String s = "   fdv  fre   ";
        final String[] s1 = s.split("", -1);
        System.out.println(s1);
    }

    public String reorderSpaces(String text) {
        final long blankCount = Arrays.stream(text.split("", -1)).filter(val -> val.equals(" ")).count();
        final long wordCount = Arrays.stream(text.split(" ")).filter(val -> !val.equals("")).count();
        final List<String> words = Arrays.stream(text.split(" ")).filter(val -> !val.equals("")).toList();
        int innerBlank = 0;

        int tailBlank = ((int) blankCount);
        if (wordCount != 1) {
            innerBlank = ((int) (blankCount / (wordCount - 1)));
            tailBlank = ((int) (blankCount % (wordCount - 1)));
        }

        final String join = String.join(" ".repeat(innerBlank), words);
        StringBuilder sb = new StringBuilder(join);
        final StringBuilder append = sb.append(" ".repeat(tailBlank));
        return append.toString();

    }
}
