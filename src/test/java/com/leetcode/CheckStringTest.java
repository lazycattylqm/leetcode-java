package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckStringTest {
    CheckString checkString = new CheckString();

    @Test
    void case_1(){
        boolean abcd = checkString.checkString("ab");
        Assertions.assertTrue(abcd);
    }

    @Test
    void case_2(){
        boolean res = checkString.checkString("ba");
        Assertions.assertFalse(res);
    }

    @Test
    void case_3(){
        boolean res = checkString.checkString("abab");
        Assertions.assertFalse(res);
    }

    @Test
    void case_4(){
        boolean res = checkString.checkString2("aaba");
        Assertions.assertFalse(res);
    }
}
