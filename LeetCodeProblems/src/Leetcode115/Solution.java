package Leetcode115;
// 不同的子序列
public class Solution {
    public int numDistinct(String s, String t) {
      // 计算s的子序列中t出现的个数
    int m = s.length();
    int n = t.length();
    if(m<n) return 0;
    int [][]dp = new int [m+1][n+1];
    // dp[i][j] 指的是在s[i:]的子序列中t[j:]出现的次数
    for(int i = 0;i<=m;i++)
    {
      dp[i][n] = 1;
    }
for(int i = m-1;i>=0;i--)
{
    char sChar = s.charAt(i);
    for(int j = n-1;j>=0;j--)
    {
        char tChar = t.charAt(j);
        if(sChar==tChar)
            dp[i][j] = dp[i+1][j+1]+dp[i+1][j];
        // 此处是选择自己是否和t[j]匹配
        else{
            dp[i][j] = dp[i+1][j];
        }
    }

}
return dp[0][0];
    }
}
