package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategorizeBoxTest {

    @Test
    void categorizeBox() {
        String s = new CategorizeBox().categorizeBox(2909, 3908, 3272, 727);
        assertEquals("Both", s);
    }
}