package Leetcode377;
// 组合总和IV
//dp[i] 代表和为i的排列的个数
// 计算总和应该考虑以每个合法的num结尾的dp的数目之和
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}


