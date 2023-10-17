package com.leetcode;

public class WaysToBuyPensPencils {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {

        if (cost1<cost2) {
            return waysToBuyPensPencils(total, cost2, cost1);
        }

        int res =0;
        int cnt =0;

        while (total >= cost1 * cnt) {
            int ways = (total - (cost1 * cnt)) / cost2 + 1;
            res += ways;
            cnt++;
        }

        return res;
    }


}
