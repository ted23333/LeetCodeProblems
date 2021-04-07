package Leetcode63;
// 不同路径Ⅱ
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m = obstacleGrid.length;
      int n = obstacleGrid[0].length;
        int [][]f = new int[m][n];
        f[0][0] = 1;
        for(int i=1;i<m;++i)
        {
            f[i][0] =obstacleGrid[i-1][0]==1?0:f[i-1][0];
        }
        for(int j = 1;j<n;++j)
        {
            f[0][j] = obstacleGrid[0][j-1]==1?0:f[0][j-1];
        }
        for(int i = 1;i<m;++i)
        {
            for(int j = 1;j<n;++j)
            {
                f[i][j] = (obstacleGrid[i-1][j]==1?0:1)*f[i-1][j]+(obstacleGrid[i][j-1]==1?0:1)*f[i][j-1];
            }
        }
        if(obstacleGrid[m-1][n-1]==1) return 0;
        // 终点有障碍的话，那么直接等于0
        return f[m-1][n-1];
    }
}
