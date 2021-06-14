package Leetcode343;
// 整数拆分
class Solution {
    // 设置DP数组
    // k是拆分出来的第一个正整数剩下的部分是n-k
    // n-k可以继续拆分或者不拆分
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        //int 类型的数组默认初始化为0
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}

