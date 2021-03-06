package com.sunpj.algorithms.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;
/*
 * 两数之和
 * */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++) {
            map.put(nums[i], i);
        }

        for (int i = 0;i < nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no two sum solution.");


    }
}
