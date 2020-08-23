package com.sunpj.algorithms.leetcode.isanagram;

import java.util.Arrays;

/*
 * 解法23：优化的哈希表解法
 * 考虑到字符范围是a~z，可以使用数组作为计数器，实现一个简化的哈希表
 * 使用一个计数器，首先遍历s进行increment，然后遍历t，进行decrement，如果出现计数小于0的字母，说明t中出现了新的字母，或者同一个字母，在t中出现
 * 的次数超过了s中出现的次数。
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 *
 * */
public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] counter = new int[26];
        Arrays.fill(counter, 0);
        for (int i = 0;i < s.length();i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for (int i = 0;i < t.length();i++) {
            counter[t.charAt(i) - 'a']--;
            if (counter[t.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
