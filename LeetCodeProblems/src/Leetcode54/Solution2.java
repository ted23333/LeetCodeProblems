package Leetcode54;

import java.util.ArrayList;
import java.util.List;

// 螺旋矩阵
public class Solution2 {
    // 螺旋矩阵

   // 这个用删除行列的方式是有问题的，为什么？
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        {
            return result;
        }
        int t=0, b= matrix.length-1,l= 0,r = matrix[0].length-1;
        int num = (b+1)*(r+1);
        int count = 0;
        while(count<=num)
        {
            for(int i = l;i<=r;i++) {result.add(matrix[t][i]); count++;}
            t++;
            for(int i = t;i<=b;i++) {result.add(matrix[i][r]); count++;}
            r--;
            for(int i = r;i>=l;i--) {result.add(matrix[b][i]); count++;}
            b--;
            for(int i=b;i>=t;i--) {result.add(matrix[i][l]); count++;}
            l++;
        }
        return result;
    }

}
