package Leetcode59;
 // 螺旋矩阵Ⅱ
// 给定一个正整数n，生成一个包含1-n2所有元素的矩阵
public class Solution {
     public int[][] generateMatrix(int n) {
         int [][]matrix =new int[n][n];
         int l=0,r=n-1,t=0,b=n-1;
         int num = 1, tar = n*n;
         while(num<=tar)
         {
             for(int i=l;i<=r;i++) matrix[t][i] = num++;
             t++; // 从左到右
             for(int i=t;i<=b;i++) matrix[i][r]= num++;
             r--;  // 从上到下
             for(int i=r;i>=l;i--) matrix[b][i] = num++;
             b--;  //从右到左
            for(int i=b;i>=t;i--) matrix[i][l] = num++;
            l++;    // 从下到上
         }
      return matrix;
     }
}
