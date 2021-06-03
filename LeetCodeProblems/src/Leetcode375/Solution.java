package Leetcode375;
// 猜数字大小Ⅱ
public class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            // 区间的长度len
            for (int start = 1; start <= n - len + 1; start++) {
                int minres = Integer.MAX_VALUE;
                for (int piv = start; piv < start + len - 1; piv++) {
                    // piv是尝试的数
                    int res = piv + Math.max(dp[start][piv - 1], dp[piv + 1][start + len - 1]);
                    // 当前试的数字加上左侧和右侧最大的数
                    minres = Math.min(res, minres);
                    // 选出来最小的一个
                }
                dp[start][start + len - 1] = minres;
            }
        }
        return dp[1][n];
    }
}

