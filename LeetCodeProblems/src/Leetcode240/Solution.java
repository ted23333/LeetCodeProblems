package Leetcode240;
//搜索二维矩阵Ⅱ
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start our "pointer" in the bottom-left
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
                //如果所在行的第一个数字都大于target，那么应该去掉这一行，行号--
            } else if (matrix[row][col] < target) {
                col++;
                // 如果所在列的最后一个数字都小于target，那么应该去掉这一列，列号++
            } else { // found it
                return true; //否则找到了这个元素
            }
        }

        return false;
    }
}
