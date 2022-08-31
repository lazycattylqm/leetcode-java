package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class StackSeq {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) {
            return false;
        }
        final List<Integer> pushedList = Arrays.stream(pushed).boxed().toList();
        final List<Integer> poppedList = Arrays.stream(popped).boxed().toList();
        final boolean sameElement = new HashSet<>(poppedList).containsAll(pushedList);
        if (!sameElement) {
            return false;
        }
        int pushedLen = pushed.length;
        int poppedLen = popped.length;

        Stack<Integer> stack = new Stack<>();
        int pushedIndex = 1;
        int poppedIndex = 0;
        stack.push(pushedList.get(0));
        while (!stack.empty()) {
            if (pushedIndex > pushedLen) {
                break;
            }
            int pop = poppedList.get(poppedIndex);
            int peek = stack.peek();
            while (pop == peek) {
                if (stack.empty()) {
                    break;
                }
                stack.pop();
                poppedIndex++;
                poppedIndex = poppedIndex < poppedLen ? poppedIndex : poppedLen - 1;
                pop = poppedList.get(poppedIndex);
                if (stack.empty()) {
                    break;
                }
                peek = stack.peek();
            }

            if (pushedIndex < pushedList.size()) {
                int push = pushedList.get(pushedIndex);
                stack.push(push);
            }
            pushedIndex++;

        }

        return stack.empty();
    }

}
