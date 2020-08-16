package com.sunpj.algorithms.leetcode.twosumii;
/*
 * 有序数组的两数之和
 * */
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target)
                return new int[] {low + 1, high + 1};
            else if (sum < target)
                low++;
            else
                high--;
        }
        throw new IllegalArgumentException("no two sum solution.");
    }




}
