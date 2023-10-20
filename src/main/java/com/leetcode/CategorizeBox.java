package com.leetcode;

public class CategorizeBox {
    // given box dimensions and mass, return category
    // 1. Bulky
    // 2. Heavy
    // 3.Both
    // 4. Neither
    // for bulky need to check if any dimension is greater or equal than  10^4 or the volume is larger or equal than 10^9
    // for heavy need to check if mass greater or equal than 100
    // if box is both bulky and heavy, return "Both"
    // if box is neither bulky nor heavy, return "Neither"
    // if box is only fit one then retrun the category
    public String categorizeBox(int length, int width, int height, int mass) {
        if (length >= 10000 || width >= 10000 || height >= 10000 || ((long) length * width * height) >= 1000000000L) {
            if (mass >= 100) {
                return "Both";
            } else {
                return "Bulky";
            }
        } else if (mass >= 100) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }


}
