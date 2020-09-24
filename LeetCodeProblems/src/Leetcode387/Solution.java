package Leetcode387;

import java.util.HashMap;
// 字符串中的第一个字符
// 遍历一遍 用哈希表存储这个已经存在的字符
public class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> count = new HashMap<Character, Integer>();
        int n= s.length();
        for(int i=0;i<n;i++)
          {
           char c  = s.charAt(i);
           count.put(c, count.getOrDefault(c,0)+1);
           // 如果这个字符已经出现了，那么就加一，否则插入一个新的kv对
          }
        for(int i=0;i<n;i++)
        {
            if(count.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
