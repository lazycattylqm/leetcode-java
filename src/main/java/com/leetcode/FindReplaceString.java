package com.leetcode;

public class FindReplaceString {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int[] actions = new int[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            String source = sources[i];
            actions[i] = s.indexOf(source, index);
        }

        String newS = s;
        int startIndex = 0;
        for (int i = 0; i < actions.length; i++) {
            if (actions[i]!=1) {
                int index = indices[i];
                String source = sources[i];
                String target = targets[i];
                newS = newS.replace(source, target);
            }
        }
        return newS;


    }
}
