package com.sunpj.algorithms.leetcode.largestRectangleArea.sec;
/*
 * area = w * h
 * 暴力解法：枚举高度
 * considering every possible pair of bars
 * 一重循环，使用双指针寻找左右边界
 * */
public class Solution2 {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0;i < heights.length;i++) {
            int l = i;
            int r = i;
            while (l >= 0 && heights[l] >= heights[i])
                l--;
            while (r < heights.length && heights[r] >= heights[i])
                r++;
            maxArea = Math.max(maxArea, heights[i] * (r - l - 1));
        }
        return maxArea;
    }
}
