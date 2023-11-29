package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SmallestInfiniteSet {

    private List<Integer> minList=new ArrayList<>();
    public SmallestInfiniteSet() {
        minList.add(1);
    }

    public int popSmallest() {
        int remove = minList.remove(0);
        if (minList.isEmpty()) {
            minList.add(remove+1);
        }
        return remove;

    }

    public void addBack(int num) {
        Integer curr = minList.get(0);
        if (curr > num) {
            minList.add(0, num);
        }
    }
}
