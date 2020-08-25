package com.sunpj.algorithms.leetcode.largestRectangleArea.sec;

import java.util.Stack;

/*
* 解法3：单调栈
* 空间换时间
* 归纳枚举高的方法：寻找左右两侧最近的高度小于h的柱子
* 先确定左边界，再确定右边界
* */
public class Solution3 {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> menoStack = new Stack<>();
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        for (int i = 0;i < heights.length;i++) {
            while (!menoStack.empty() && heights[menoStack.peek()] >= heights[i])
                menoStack.pop();
            left[i] = menoStack.empty() ? -1 : menoStack.peek();
            menoStack.push(i);
        }
        menoStack.clear();
        for (int i = heights.length - 1;i >= 0;i--) {
            while (!menoStack.empty() && heights[menoStack.peek()] >= heights[i])
                menoStack.pop();
            right[i] = menoStack.empty() ? heights.length : menoStack.peek();
            menoStack.push(i);
        }
        for (int i = 0;i < heights.length;i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
        }
        return maxArea;
    }
}
