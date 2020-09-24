package Leetcode49;

import java.util.*;
// 字母异位词分组
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        //前面为字母标记，后面就为同种字符串的集合
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // 将每个字符串对应字符数组经排序后得到的字符串作为该字符串的分类标志
            String flag = String.valueOf(chars);
            // 再转回字符串
            List<String> list = map.getOrDefault(flag, new ArrayList<>());
            list.add(str);
            map.put(flag, list);
        }
        return new ArrayList<>(map.values());
    }
}
