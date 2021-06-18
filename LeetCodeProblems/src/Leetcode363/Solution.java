package Leetcode363;
// 矩形区域不超过k的最大数值和

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        /*
        状态转移方程
        dp(i1,j1,i2,j2) = dp(i1,j1,i2 - 1,j2) +
        dp(i1,j1,i2,j2 - 1) - dp(i1,j1,i2 - 1,j2 - 1) +
         matrix[i2 - 1][j2 - 1];
         */
        int rows = matrix.length, cols = matrix[0].length, max = Integer.MIN_VALUE;
        for (int i1 = 1; i1 <= rows; i1++) {
            for (int j1 = 1; j1 <= cols; j1++) {
                int[][] dp = new int[rows + 1][cols + 1]; // renew  // from (i1,j1) to (i2,j2)
                dp[i1][j1] = matrix[i1 - 1][j1 - 1];
                for (int i2 = i1; i2 <= rows; i2++) {
                    for (int j2 = j1; j2 <= cols; j2++) {
                        dp[i2][j2] = dp[i2 - 1][j2] + dp[i2][j2 - 1] - dp[i2 - 1][j2 - 1] + matrix[i2 - 1][j2 - 1];
                        if (dp[i2][j2] <= k && dp[i2][j2] > max) max = dp[i2][j2];
                    }
                }
            }
        }
        return max;
    }


}
