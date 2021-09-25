package offer63;
// 股票的最大利润 只允许买卖一次
public class Solution {
    // 动态规划
    public int maxProfit(int[] prices) {
        //设置动态规划列表dp dp[i] 代表以price[i]为结尾的子树组的最大利润 简称为前i-1日的最大利润 dp[i-1] 和 第i日卖出的最大利润中的最大值
        int cost = Integer.MAX_VALUE,profit =0;
        for(int price:prices){
            cost = Math.min(cost,price);
            profit = Math.max(profit,price-cost);
        }
        return profit;

    }
}
