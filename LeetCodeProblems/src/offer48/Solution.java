package offer48;

import java.util.HashMap;
import java.util.Map;

// 最长的不含重复字符的子字符串
// 状态转移方程
// dp[j]代表以s_j 为结尾的最长不重复子串的长度
// 转移方程 固定右边界 设左边距离最近的相同字符为s[i] 即s[i] = s[j]
/*
当i<0 无相同字符 dp[j] = dp[j-1]+1;
dp[j-1]<j-i 说明字符s[i]在区间之外 dp[j] = dp[j-1]+1;
dp[j-1]>=j-i 说明字符s[i]在区间之内  dp[j] =j-i

 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        // 哈希表负责统计各个字符最后一次出现的索引位置

        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }
}


