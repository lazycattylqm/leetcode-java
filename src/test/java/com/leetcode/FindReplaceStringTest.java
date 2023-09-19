package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FindReplaceStringTest {
    FindReplaceString solution = new FindReplaceString();

    @Test
    void case_1(){
        String abcd = solution.findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"});

        Assertions.assertEquals("eeebffff", abcd);
    }

    @Test
    void case_2(){
        String abcd = solution.findReplaceString("wreorttvosuidhrxvmvo", new int[]{14,12,10,5,0,18}, new String[]{"rxv","dh","ui","ttv","wreor","vo"}, new String[]{"frs","c","ql","qpir","gwbeve","n"});

        Assertions.assertEquals("gwbeveqpirosqlcfrsmn", abcd);
    }

    @Test
    @Disabled
    void case_3(){
        String abcd = solution.findReplaceString("fvokzonyhukpwbnkomdianhirsvdulhsfseaqzktupyeverfsd", new int[]{26,30,38,2,41,10,8,44,19,4,13,28,21,35,23,16}, new String[]{"rxv","dh","ui","ttv","wreor","vo"}, new String[]{"frs","c","ql","qpir","gwbeve","n"});

        Assertions.assertEquals("gwbeveqpirosqlcfrsmn", abcd);
    }
}
