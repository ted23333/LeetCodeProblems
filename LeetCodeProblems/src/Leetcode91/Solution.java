package Leetcode91;
// 91 解码方法
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0)=='0') return 0;
        // 第一个字符不能是0，否则直接返回0
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=1;i<n;i++) {
            if (s.charAt(i)=='0') {
                if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2'){
                    if (i==1) dp[i] = 1;
                    else dp[i] = dp[i-2];
                }
                else
                    return 0;
            }
            else {
                int value = 10*(s.charAt(i-1)-'0') + (s.charAt(i)-'0');
                if (value>=11 && value<=26) {
                    if (i==1) dp[i] = dp[0] + 1;
                    else dp[i] = dp[i-1] + dp[i-2];
                }
                else dp[i] = dp[i-1];
            }
        }
        return dp[n-1];
    }
}


