package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PermuteUnique {
    private List<Boolean> visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> initInput = Arrays.stream(nums)
                .boxed()
                .sorted()
                .toList();
        List<Integer> tempResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        visited = Stream.generate(() -> false)
                .limit(nums.length)
                .collect(Collectors.toList());
        backtrack(0, initInput, tempResult, result);

        return result;
    }

    private void backtrack(int index, List<Integer> curr, List<Integer> tempResult, List<List<Integer>> result) {
        if (index == curr.size()) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = 0; i < curr.size(); i++) {
            if (visited.get(i)) {
                continue;
            }

            if (i > 0 && Objects.equals(curr.get(i), curr.get(i - 1)) && !visited.get(i - 1)) {
                continue;
            }

            visited.set(i, true);
            tempResult.add(curr.get(i));
            backtrack(index + 1, curr,tempResult, result);
            visited.set(i, false);
            tempResult.remove(index);
        }
    }
}
