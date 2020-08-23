package com.sunpj.algorithms.leetcode.groupanagrams;

import java.util.*;

/*
 * 49. 字母异位词分组
 * 分组意味着同一组的单词具有相同的特性，可以将此特性提取出来，作为map的key，从而实现相同key的单词被划分到同一组。
 * 另外一种判断是否为字母异位词的方法是使用字符计数器，如果字符计数器统计结果相同，则是异位词。
 * 所以可以将字符计数器作为key。
 * 维护一个映射，ans：{String -> List}，将字符计数器作为key。
 * categorize by character counter
 *
 * 时间复杂度：O(n*k)
 * 空间复杂度：O(n*k)
 * */
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> ans = new HashMap<>();
        int[] counter = new int[26];
        for (String str : strs) {
            Arrays.fill(counter, 0);
            for (char ch : str.toCharArray())
                counter[ch - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < counter.length;i++)
                sb.append("#").append(counter[i]);
            String key = sb.toString();
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList<>());
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }
}
