package com.leetcode;

import java.util.Arrays;

public class CheckString {
    public boolean checkString(String s) {
        StringBuilder sb = new StringBuilder("a");
        StringBuilder reduce = Arrays.stream(s.split("")).reduce(sb, (a, b) -> {
            String substring = a.substring(a.length() - 1, a.length());
            if (!b.equals(substring)) {
                return a.append(b);
            }
            return a;
        }, (v1, v2) -> v2);

        return reduce.toString().equals("ab") || reduce.toString().equals("a");

    }

    public boolean checkString2(String s) {
        int res = 0;
        String mark = "a";
        for (String string : s.split("")) {
            if (!string.equals(mark)) {
                res++;
                mark= string;
            }
            if (res>=2) {
                return false;
            }
        }
        return true;

    }
}
