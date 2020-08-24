package com.sunpj.algorithms.leetcode.movezeroes.fourth;
/*
* 一维数组的坐标变化
* 双指针
* insertPos
*
* */
public class Solution2 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                if (i != insertPos) {
                    nums[insertPos] = nums[i];
                    nums[i] = 0;
                }
                insertPos++;
            }
        }
    }


}
