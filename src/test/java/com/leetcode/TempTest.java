package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TempTest {

    @Test
    @DisplayName("test temp for output")
    void test_output() {
        Assertions.assertEquals(1, new Temp().outPut(1));
    }
}
