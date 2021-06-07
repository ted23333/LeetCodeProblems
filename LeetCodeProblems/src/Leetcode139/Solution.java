package Leetcode139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 单词拆分
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        // 直接将转化为set
        boolean[] dp = new boolean[s.length() + 1];
        //定义 dp[i]表示字符串前i个字符组成的字符串s[0,i-1]
        // 是否能被空格拆分成若干个字典中出现的单词
        // dp[i] = dp[j]&&check(s[j,i-1])
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}


