package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SmallestInfiniteSet {

    private List<Integer> minList=new ArrayList<>();
    private int min = 1;
    public SmallestInfiniteSet() {
    }

    public int popSmallest() {
        if (minList.isEmpty()) {
            int v = min;
            min++;
            return v;
        }
        int v = minList.remove(0);
        return v;
    }

    public void addBack(int num) {
        if (min>num) {
            minList.add(num);
            minList.sort(Integer::compareTo);
        }
    }
}
