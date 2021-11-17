package Leetcode55;
// 2021117
public class Solution2 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 0) return false;
        boolean dp[] = new boolean[n];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            if (dp[i] == true) {
                for (int j = 1;i+j<=n-1&&j <= nums[i]; j++) {
                    dp[i + j] = true;
                }
            }

        }

        return dp[n - 1];
    }
}
