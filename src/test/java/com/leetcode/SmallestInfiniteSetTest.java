package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {
    @Test
    void test_case() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.addBack(1);
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.addBack(2);
        smallestInfiniteSet.addBack(3);
        smallestInfiniteSet.popSmallest();
        smallestInfiniteSet.popSmallest();
    }

}