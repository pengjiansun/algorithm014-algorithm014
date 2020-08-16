package com.sunpj.algorithms.leetcode.removedups;
/*
* 删除排序数组中的重复项
*
* */
public class Solution1 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int pivot = nums[0];
        int len = 1;
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] != pivot) {
                nums[len++] = nums[i];
                pivot = nums[i];
            }
        }
        return len;
    }


}
