package Leetcode121;
// 使用动态规划来完成
public class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0; // 没有卖出的可能性
        // 定义状态，第i天卖出的最大收益
        int[] dp = new int[prices.length];
        dp[0] = 0;  // 初始边界
        int cost = prices[0]; // 成本
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - cost);
            // 如果价格比成本高，那么选择卖出
            // 选择较小的成本买入
            cost = Math.min(cost, prices[i]);
        }

        return dp[prices.length - 1];
    }
}
