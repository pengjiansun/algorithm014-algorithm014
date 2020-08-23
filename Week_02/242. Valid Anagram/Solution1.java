package com.sunpj.algorithms.leetcode.isanagram;

import java.util.Arrays;

/*
* 异位词指字母出现次数相同，位置可以不同的词。按照顺序重新排列后，完全相同。
* 解法1：暴力解法，排序后，比较
* 时间复杂度：O(nlogn)
* 空间复杂度：取决于排序的空间复杂度
*
*
* */
public class Solution1 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);

    }
}
