package Leetcode3;

import java.util.HashMap;
import java.util.Map;

// 20210921
public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        // 使用dp数组存储以当前字符为结尾的最长子串的长度
        // 遍历到当前字符的时候，寻找上一个字符所在的位置
        //当前的位置可能有几种情况
        // 当前位置的上一个字符不存在 （-1）或者两个字符之间的间距大于当前的最大值，那么dp[i] = dp[i-1]+1
        // 当前位置的上一个字符小于等于当前的最大值 dp[i]= i-j
        int max = 0;
        int length = s.length();
        if(length<=1) return length;
         int []dp = new int[length];
         Map<Character,Integer> map = new HashMap<Character,Integer>();
         map.put(s.charAt(0),0);
         dp[0] =1;
         for(int i = 1;i<length;i++)
         {
         int j = map.getOrDefault(s.charAt(i),-1);
         if(i-j>dp[i-1]) dp[i] = dp[i-1]+1;
         else dp[i] = i-j;
         max = Math.max(max,dp[i]);
         map.put(s.charAt(i),i);
         }
         return max;
    }
}
