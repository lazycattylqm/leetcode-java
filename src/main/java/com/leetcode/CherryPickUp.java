package com.leetcode;

import java.util.Arrays;

public class CherryPickUp {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        dp[0][0] = grid[0][0] == 1 ? 1 : 0;
        for (int i = 1; i < n; i++) {

            int lastH = grid[0][i - 1];
            int currentH = grid[0][i];
            if (currentH==-1) {
                dp[0][i] = -1;
                continue;
            }
            if (lastH == 0 || lastH == 1) {
                dp[0][i] = dp[0][i - 1] + grid[0][i];
            } else {
                dp[0][i] = -1;
            }

        }
        for (int i = 1; i < n; i++) {
            int lastV = grid[i - 1][0];
            int currentV = grid[i][0];
            if (currentV==-1) {
                dp[i][0] = -1;
                continue;
            }
            if (lastV == 0 || lastV == 1) {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            } else {
                dp[i][0] = -1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int lastH = dp[i][j - 1];
                int lastV = dp[i - 1][j];
                if (grid[i-1][j]==-1&&grid[i][j-1]==-1) {
                    dp[i][j] = -1;
                    continue;
                }
                if (lastH == -1 && lastV == -1) {
                    dp[i][j] = -1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        int i = dp[n - 1][n - 1];
        return Math.max(i, 0);
    }


}
class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] f = new int[n * 2 - 1][n][n];
        for (int i = 0; i < n * 2 - 1; ++i) {
            for (int j = 0; j < n; ++j) {
                Arrays.fill(f[i][j], Integer.MIN_VALUE);
            }
        }
        f[0][0][0] = grid[0][0];
        for (int k = 1; k < n * 2 - 1; ++k) {
            for (int x1 = Math.max(k - n + 1, 0); x1 <= Math.min(k, n - 1); ++x1) {
                int y1 = k - x1;
                if (grid[x1][y1] == -1) {
                    continue;
                }
                for (int x2 = x1; x2 <= Math.min(k, n - 1); ++x2) {
                    int y2 = k - x2;
                    if (grid[x2][y2] == -1) {
                        continue;
                    }
                    int res = f[k - 1][x1][x2]; // 都往右
                    if (x1 > 0) {
                        res = Math.max(res, f[k - 1][x1 - 1][x2]); // 往下，往右
                    }
                    if (x2 > 0) {
                        res = Math.max(res, f[k - 1][x1][x2 - 1]); // 往右，往下
                    }
                    if (x1 > 0 && x2 > 0) {
                        res = Math.max(res, f[k - 1][x1 - 1][x2 - 1]); // 都往下
                    }
                    res += grid[x1][y1];
                    if (x2 != x1) { // 避免重复摘同一个樱桃
                        res += grid[x2][y2];
                    }
                    f[k][x1][x2] = res;
                }
            }
        }
        return Math.max(f[n * 2 - 2][n - 1][n - 1], 0);
    }
}

