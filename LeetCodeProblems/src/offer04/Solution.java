package offer04;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
      int m = matrix.length;
      if(m==0) return false;
      int n = matrix[0].length;
      if(n==0) return false;
      int row = m-1,col = 0;
      while(row>=0&&col<=n-1)
      {
          if(matrix[row][col]==target) return true;
         else if(matrix[row][col]>target) row--;
         else col++;

      }
      return false;
    }
}
