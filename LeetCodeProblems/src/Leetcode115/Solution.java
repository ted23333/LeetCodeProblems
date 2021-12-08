package Leetcode115;
// 不同的子序列
// 创建一个二维数组 dp[i][j] 表示 s[i:]的子序列中t[j:]出现的个数
public class Solution {
    public int numDistinct(String s, String t) {
      // 计算s的子序列中t出现的个数
    int m = s.length();
    int n = t.length();
    if(m<n) return 0;
    // s得比t的序列要长
    int [][]dp = new int [m+1][n+1];
    // dp[i][j] 指的是在s[i:]的子序列中t[j:]出现的次数
    for(int i = 0;i<=m;i++)
    {
      dp[i][n] = 1;
    }
    // 当j为n的时候 t[j:]是空字符串，是任何字符串的子串
for(int i = m-1;i>=0;i--)
{
    char sChar = s.charAt(i);
    for(int j = n-1;j>=0;j--)
    {
        char tChar = t.charAt(j);
        if(sChar==tChar)
            dp[i][j] = dp[i+1][j+1]+dp[i+1][j];
        // 此处是选择自己是否和t[j]匹配 如果匹配了就是前者 不匹配就是后者
        else{
            dp[i][j] = dp[i+1][j];
        }
    }

}
return dp[0][0];
    }
}
