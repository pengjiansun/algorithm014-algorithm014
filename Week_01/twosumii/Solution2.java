package com.sunpj.algorithms.leetcode.twosumii;

public class Solution2 {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0;i < numbers.length;i++) {
            int complement = target - numbers[i];
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == complement) {
                    return new int[] {i + 1, mid + 1};
                } else if (numbers[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution.");
    }
}
