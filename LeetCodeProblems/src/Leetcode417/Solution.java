package Leetcode417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int m, n;
    private int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private boolean in_area(int x, int y){
        return 0 <= x && x < m && 0 <= y && y < n;
    }
    private void dfs(int[][] matrix, int x, int y, int[][] tmp){
        tmp[x][y] = 1;
        for (int[] d : direction) {
            int newx = x + d[0];
            int newy = y + d[1];
            if (!in_area(newx, newy) || matrix[x][y] > matrix[newx][newy] || tmp[newx][newy] == 1){
                continue;
            }
            dfs(matrix, newx, newy, tmp);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return ans;
        m = matrix.length;
        n = matrix[0].length;
        int[][] po = new int[m][n], ao = new int[m][n]; //po 太平洋，ao 大西洋
        for (int i = 0; i < n; ++i){
            dfs(matrix, 0, i, po);
            dfs(matrix, m - 1, i, ao);
        }
        for (int i = 0; i < m; ++i){
            dfs(matrix, i, 0, po);
            dfs(matrix, i, n - 1, ao);
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (po[i][j] == 1 && ao[i][j] == 1){
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
}

