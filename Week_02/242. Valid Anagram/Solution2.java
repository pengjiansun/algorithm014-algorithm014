package com.sunpj.algorithms.leetcode.isanagram;

import java.util.Arrays;

/*
* 解法2：使用哈希表
* 考虑到字符范围是a~z，可以使用数组作为计数器，实现一个简化的哈希表
* 实际有两种实现方法：
* （1）创建两个计数器作为简化的哈希表，字母的ascii码作为key值，对s和t分别计数，最后比较是否相同。
* （2）使用一个计数器，首先遍历s进行increment，然后遍历t，进行decrement，如果出现计数小于0的字母，说明t中出现了新的字母，或者同一个字母，在t中出现
* 的次数超过了s中出现的次数。
* 时间复杂度：O(n)
* 空间复杂度：O(1)
*
* */
public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int n = s.length();
        int[] counter1 = new int[26];
        int[] counter2 = new int[26];
        Arrays.fill(counter1, 0);
        Arrays.fill(counter2, 0);
        for (int i = 0;i < n;i++) {
            counter1[s.charAt(i) - 'a']++;
            counter2[t.charAt(i) - 'a']++;
        }
        for (int i = 0;i < 26;i++) {
            if (counter1[i] != counter2[i])
                return false;
        }
        return true;
    }

}
