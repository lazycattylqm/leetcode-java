package com.leetcode;

public class ConvertTemperature {
    public double[] convertTemperature(double celsius) {
        double v = celsius + 273.15;
        double v1 = celsius * 1.80 + 32.00;
        return new double[]{v, v1};
    }
}
