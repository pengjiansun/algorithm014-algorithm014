package com.sunpj.algorithms.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;
/*
 * 两数之和
 * */
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[] {map.get(complement), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution.");

    }
}
