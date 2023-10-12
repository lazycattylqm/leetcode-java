package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheArrayConcValTest {

    @Test
    void findTheArrayConcVal() {
        FindTheArrayConcVal solution = new FindTheArrayConcVal();

        long theArrayConcVal = solution.findTheArrayConcVal(new int[]{7, 52, 2, 4});

        assertEquals(596, theArrayConcVal);
    }
}