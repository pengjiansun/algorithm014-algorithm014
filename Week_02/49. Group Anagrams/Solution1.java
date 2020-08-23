package com.sunpj.algorithms.leetcode.groupanagrams;

import org.springframework.jdbc.support.incrementer.HsqlMaxValueIncrementer;

import java.util.*;

/*
* 49. 字母异位词分组
* 分组意味着同一组的单词具有相同的特性，可以将此特性提取出来，作为map的key，从而实现相同key的单词被划分到同一组。
* 考虑到字母异位词，按照顺序排序后相同，可以将有序的字符串作为key。
* 维护一个映射，ans：{String -> List}，将有序字符串作为key。
*
* 时间复杂度：O(n*k*logk)
* 空间复杂度：O(n*k)
*
* Categorize by Sorted String
* */
public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> ans = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {
                "eat","tea","tan","ate","nat","bat"
        };
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.groupAnagrams(strs));
    }
}
