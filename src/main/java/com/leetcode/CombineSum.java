package com.leetcode;import java.util.ArrayList;import java.util.Arrays;import java.util.List;public class CombineSum {    public List<List<Integer>> combinationSum(int[] candidates, int target){        List<Integer> integers = Arrays.stream(candidates)                .boxed()                .sorted()                .toList();        List<Integer> result = new ArrayList<>();        getCombineSum(integers, target, result, 0);        return null;    }    public void getCombineSum(List<Integer> candidates, int target, List<Integer> result, int tempSum) {        for (Integer val : candidates) {            if (tempSum + val == target) {                System.out.println(result);                System.out.println(val);            }            if (tempSum + val < target) {                result.add(val);                getCombineSum(candidates, target, result, tempSum + val);            }            if (tempSum + val > target) {                result.remove(result.size() - 1);                return;            }        }    }    private int start;    private int end;    private int target;    private int length;    private List<Integer> candidates = new ArrayList<>();    private List<List<Integer>> result = new ArrayList<>();    private void init(int length, int target) {        start = 1;        end = 9 - length + 1;        this.target = target;        this.length = length;    }    private void combineSumCalc(int now, int sum) {        if (sum == target && candidates.size() == this.length) {            result.add(new ArrayList<>(candidates));            return;        }        if (sum != target && candidates.size() == this.length) {            return;        }        for (int i = now; i <= 9; i++) {            candidates.add(i);            combineSumCalc(i + 1, sum + i);            candidates.remove(candidates.size() - 1);        }    }    public List<List<Integer>> combinationSum3(int k, int n) {        init(k, n);        combineSumCalc(1, 0);        return result;    }}