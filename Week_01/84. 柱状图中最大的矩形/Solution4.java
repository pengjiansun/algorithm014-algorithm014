package com.sunpj.algorithms.leetcode.largestRectangleArea.sec;

import java.util.Arrays;
import java.util.Stack;

/*
 * 单调栈+常数优化
 * 在入栈时，已经计算出了左边界
 * 在出栈时，找到了右边界，所以更新右边界即可。右边界数组初始化为length
 * */
public class Solution4 {
    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Arrays.fill(right, heights.length);
        Stack<Integer> monoStack = new Stack<>();
        for (int i = 0;i < heights.length;i++) {
            while (!monoStack.empty() && heights[monoStack.peek()] >= heights[i]) {
                right[monoStack.pop()] = i;
            }
            left[i] = monoStack.empty() ? -1 : monoStack.peek();
            monoStack.push(i);
        }
        int ans = 0;
        for (int i = 0;i < heights.length;i++)
            ans = Math.max(ans, heights[i] * (right[i] - left[i] - 1));
        return ans;
    }
}
