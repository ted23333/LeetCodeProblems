package Leetcode486;
// 预测赢家
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][length];
        // 定义二维数组都等于宿主的长度
        // d[i][j] 表示当数组的剩下的部分为下标i到下标j的时候，当前玩家与另一个玩家的分数之差最大值，
        // 当前玩家是先手
        for (int i = 0; i < length; i++) {
            dp[i][i] = nums[i];
        }//dp数组初始化
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
                // 如果甲拿了nums[i] 乙变成先手面对区间[i+1 j] 乙对甲的净胜分变成dp[i+1][j]
            }
        }
        return dp[0][length - 1] >= 0;
    }
}

