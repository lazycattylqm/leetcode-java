package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {
    @Test
    void test_case() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.popSmallest();
    }

}