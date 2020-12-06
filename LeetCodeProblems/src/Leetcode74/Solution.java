package Leetcode74;
// 搜索二叉矩阵
//展平成一维数组套二分法
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        if(m==0) return false;
        int n = matrix[0].length;
        // 二分查找
        int left = 0, right = m*n-1;
        int pivotIdx,pivotElement;
        while(left<=right)
        {
            pivotIdx = left+(right-left)/2;
            pivotElement = matrix[pivotIdx/n][pivotIdx%n];
            if(target == pivotElement) return true;
            else {
                if(target<pivotElement) right = pivotIdx-1;
                else left = pivotIdx + 1;
            }

        }
        return false;
    }
}
