package Leetcode188;

import java.util.Arrays;

// 买卖股票的最佳时机IV
class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        k = Math.min(k, n / 2);
        // 总共有n天，那么最多进行一般天数的交易
        int[][] buy = new int[n][k + 1];
        // buy代表对于其中的交易i，恰好进行j笔交易
        int[][] sell = new int[n][k + 1];
        // sell 代表对于其中的交易i，恰好进行j笔交易
        buy[0][0] = -prices[0];
        sell[0][0] = 0;
        for (int i = 1; i <= k; ++i) {
            buy[0][i] = sell[0][i] = Integer.MIN_VALUE / 2;
            // 赋予一个不合理的初值
        }

        for (int i = 1; i < n; ++i) {
            buy[i][0] = Math.max(buy[i - 1][0], sell[i - 1][0] - prices[i]);
            for (int j = 1; j <= k; ++j) {
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j] - prices[i]);
                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);
            }
        }

        return Arrays.stream(sell[n - 1]).max().getAsInt();
    }
}
