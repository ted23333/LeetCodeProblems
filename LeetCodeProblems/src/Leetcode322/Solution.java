package Leetcode322;

import java.util.Arrays;
// 零钱兑换
public class Solution {
    public int coinChange(int[] coins, int amount) {
        // 硬币集合 ，amount 是要凑齐的总数
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        // 0到amount
        // dp[i]代表以i为总数的最少硬币数量
        Arrays.fill(dp, max);
        // 初始化dp
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    // 当前的硬币面值比总数小的话，更新最小值
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
        // 验证能不能被正好分完
    }
}

