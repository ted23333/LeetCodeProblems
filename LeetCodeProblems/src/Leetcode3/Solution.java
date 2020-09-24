package Leetcode3;

import java.util.HashMap;

// 利用滑动窗口寻找最长的子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                //哈希表存储字符是否出现
                left = Math.max(left,map.get(s.charAt(i)) + 1);
                //如果重复了就找到当前哈希表里面的值，即滑动窗口的左边的坐标令其加一
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }
}

