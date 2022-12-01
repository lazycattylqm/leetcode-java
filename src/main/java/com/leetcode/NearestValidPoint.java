package com.leetcode;

public class NearestValidPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int result = -1;
        int index = -1;

        for (int i = 0; i < points.length; i++) {
            final int[] point = points[i];
            if (valid(x, y, point)) {
                final int dist = dist(x, y, point);
                if (result == -1) {
                    result = dist;
                    index = i;
                    continue;
                }
                if (dist < result) {
                    result = dist;
                    index = i;
                    continue;
                }
            }
        }


        return index;

    }

    private boolean valid(int x, int y, int[] point) {
        return point[0] == x || point[1] == y;
    }

    private int dist(int x, int y, int[] point) {
        return Math.abs(point[0] - x) + Math.abs(point[1] - y);
    }
}
