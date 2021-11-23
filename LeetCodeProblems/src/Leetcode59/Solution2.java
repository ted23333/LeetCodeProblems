package Leetcode59;

public class Solution2 {
    public int[][] generateMatrix(int n) {
          int [][]res = new int[n][n];
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int directionindex = 0;
        boolean [][]visited = new boolean[n][n];
        int total = n*n;
        int row = 0;
        int column = 0;
        for(int i=1;i<=total;i++)
        {
            res[row][column] = i;
            visited[row][column] = true;
            int nextRow = row + directions[directionindex][0],nextColumn = column+directions[directionindex][1];
            if(nextRow<0||nextRow>=n||nextColumn<0||nextColumn>=n||visited[nextRow][nextColumn]){
                directionindex = (directionindex+1)%4;
            }
            row += directions[directionindex][0];
            column += directions[directionindex][1];
        }
        return res;
    }
}
