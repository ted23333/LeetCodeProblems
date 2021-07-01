package Leetcode463;
// 岛屿的周长
class Solution {
    int count = 0;
    int m,n;
    public int islandPerimeter(int[][] grid) {
        m  = grid.length;
        n = grid[0].length;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    private void dfs(int [][]grid,int i,int j)
    {
        if(i<0||i>=m||j<0||j>=n||grid[i][j] ==0) {count++;return;}
        if(grid[i][j]==2) return;
        // 边界条件判断
        grid[i][j] = 2;

        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
}
