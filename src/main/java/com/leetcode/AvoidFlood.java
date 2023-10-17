package com.leetcode;

import java.util.*;

public class AvoidFlood {

    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length];
        Arrays.fill(ans, 1);
        TreeSet<Integer> st = new TreeSet<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < rains.length; ++i) {
            if (rains[i] == 0) {
                st.add(i);
            } else {
                ans[i] = -1;
                if (mp.containsKey(rains[i])) {
                    Integer it = st.ceiling(mp.get(rains[i]));
                    if (it == null) {
                        return new int[0];
                    }
                    ans[it] = rains[i];
                    st.remove(it);
                }
                mp.put(rains[i], i);
            }
        }
        return ans;
    }
}
