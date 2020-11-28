package Leetcode48;

public class Solution {
    public void rotate(int[][] matrix) {
       int row = matrix.length;
      // 先转置矩阵
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<row;j++)
            {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
                // 转置只完成下三角阵
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row/2;j++)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][row-j-1];
                //这里要对调的两列的数值加在一起等于row-1
                matrix[i][row-j-1]  = tmp;
            }
        }
    }
}
