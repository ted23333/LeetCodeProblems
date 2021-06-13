package Leetcode221;
// 最大正方形
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxSide;
            // 如果边界为0 直接返回0
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        // 设定一个dp数组，数组表示以ij为结尾的最大的正方形的边长
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                        // 如果在边界上直接就等于1
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                        // 如果不在边界上，依赖于其左边、上边、左上角的最小值+1
                    }
                    maxSide = Math.max(maxSide, dp[i][j]);
                    // 更新最大值
                }
            }
        }
        int maxSquare = maxSide * maxSide;
        // 返回边长的平方
        return maxSquare;
    }
}


