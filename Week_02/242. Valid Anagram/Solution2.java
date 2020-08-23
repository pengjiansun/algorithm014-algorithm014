package com.sunpj.algorithms.leetcode.isanagram;

import java.util.Arrays;

/*
* 解法2：使用哈希表
* 考虑到字符范围是a~z，可以使用数组作为计数器，实现一个简化的哈希表
* 实际有两种实现方法：
* 方法1是首先遍历s和t进行increment和decrement计数，然后检查counter。
* 方法2是首先遍历s进行increment，然后遍历t，进行decrement，如果出现计数小于0的字母，说明t中出现了新的字母，或者同一个字母，在t中出现
* 的次数超过了s中出现的次数。
* 时间复杂度：O(n)
* 空间复杂度：O(1)
*
* */
public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] counter = new int[26];
        Arrays.fill(counter, 0);
        for (int i = 0;i < s.length();i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int i = 0;i < counter.length;i++) {
            if (counter[i] != 0)
                return false;
        }
        return true;
    }

}
