package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackSeqTest {
    @Test
    void case_1() {
        final boolean b = new StackSeq().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
        Assertions.assertTrue(b);
    }

    @Test
    void case_2() {
        final boolean b = new StackSeq().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2});
        Assertions.assertFalse(b);
    }
}
