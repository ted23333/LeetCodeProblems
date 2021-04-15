package Leetcode123;
// 买卖股票的最佳时机
// 动态规划
// 任意一天结束之后，可以记录四个状态的变化
/*
1 只进行过一次买操作 buy1
2 进行了一次买和卖的操作 sell1
3 完成了一次交易之后，进行了第二次买的操作 buy2
4 完成了全部两笔交易 sell2

 */
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < n; ++i) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}

