package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReOrderSpaceTest {
    @Test
    void ReOrderTestCase1() {
        final String text = "  this   is  a sentence ";
        final String s = new ReOrderSpace().reorderSpaces(text);
        Assertions.assertEquals("this   is   a   sentence", s);
    }

    @Test
    void ReOrderTestCase2() {
        final String text = " practice   makes   perfect";
        final String s = new ReOrderSpace().reorderSpaces(text);
        Assertions.assertEquals("practice   makes   perfect ", s);
    }

    @Test
    void ReOrderTestCase3() {
        final String text = "hello   world";
        final String s = new ReOrderSpace().reorderSpaces(text);
        Assertions.assertEquals("hello   world", s);
    }

    @Test
    void ReOrderTestCase4() {
        final String text = "  walks  udp package   into  bar a";
        final String s = new ReOrderSpace().reorderSpaces(text);
        Assertions.assertEquals("walks  udp  package  into  bar  a ", s);
    }

    @Test
    void ReOrderTestCase5() {
        final String text = "a";
        final String s = new ReOrderSpace().reorderSpaces(text);
        Assertions.assertEquals("a", s);
    }
}
