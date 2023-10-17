package com.leetcode;

public class SumOfMultiples {
    public int sumOfMultiples(int n) {
        int i = sumOfMultiples(3, n);
        int j = sumOfMultiples(5, n);
        int k = sumOfMultiples(7, n);
        int l = sumOfMultiples(15, n);
        int m = sumOfMultiples(21, n);
        int o = sumOfMultiples(35, n);
        int p = sumOfMultiples(105, n);
        return i + j + k - l - m - o + p;
    }

    private int sumOfMultiples(int n, int m) {
        int i = m % n;
        int end = m - i;
        int times  = (end - n) / n + 1;
        return (n + end) * times / 2;
    }
}
