package com.sunpj.algorithms.leetcode.movezeroes.fourth;

import java.util.Arrays;

/*
* 暴力解法
* 新开一个数组，遍历数组，将非0元素放到新数组中
* */
public class Solution1 {
    public void moveZeroes(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.fill(array, 0);
        int i = 0;
        for (int num : nums) {
            if (num != 0)
                array[i++] = num;
        }
        for (i = 0;i < array.length;i++)
            nums[i] = array[i];
    }
}
