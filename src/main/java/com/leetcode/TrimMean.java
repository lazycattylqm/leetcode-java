package com.leetcode;

import java.util.Arrays;

public class TrimMean {
    public double trimMean(int[] arr) {
        final int length = arr.length;
        final long skip = (long) (length * 0.05);
        final long limit = length - skip - skip;
        final double asDouble = Arrays.stream(arr)
                .boxed()
                .sorted(Integer::compareTo)
                .skip(skip)
                .limit(limit)
                .mapToDouble(Integer::intValue)
                .average()
                .getAsDouble();
        return asDouble;
    }


}
