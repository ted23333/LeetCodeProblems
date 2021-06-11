package Leetcode174;

import java.util.Arrays;

class Solution2 {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length, m = dungeon[0].length;
        int[][] dp = new int[n + 1][m + 1];
        // 设定一个更大的dp数组
        for (int i = 0; i <= n; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        // 将其中的所有值赋值为无效值
        dp[n][m - 1] = dp[n - 1][m] = 1;
        // dp数组调大，然后就是n-1 m-1的下一个位置体力得是1
        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                int minn = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minn - dungeon[i][j], 1);
                // 当前体力要么为1，要么是minn-dungeon[i][j]
            }
        }
        // 倒着递推
        return dp[0][0];
    }
}


