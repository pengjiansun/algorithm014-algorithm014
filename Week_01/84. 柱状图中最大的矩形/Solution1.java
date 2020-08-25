package com.sunpj.algorithms.leetcode.largestRectangleArea.sec;

import java.util.Map;

/*
* area = w * h
* 暴力解法：使用双指针枚举宽度
* considering every possible pair of bars
* 双重循环，使用左右边界，找出边界中的最小高度柱子，从而计算出当前宽度下的矩形面积
* */
public class Solution1 {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0;i < heights.length;i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i;j < heights.length;j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
}
