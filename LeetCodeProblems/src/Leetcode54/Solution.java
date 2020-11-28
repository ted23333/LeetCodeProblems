package Leetcode54;

import java.util.ArrayList;
import java.util.List;

// 螺旋矩阵
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> result = new ArrayList<>();
     if(matrix==null||matrix.length==0||matrix[0].length==0)
     {
         return result;
     }
     int rows = matrix.length,columns = matrix[0].length;
     boolean[][] visited = new boolean[rows][columns];
     int total = rows*columns;
     int row =0,column=0;
     int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
     // 方向分别为 右 下 左 上
     int directionindex=0;
     for(int i=0;i<total;i++)
     {
         result.add(matrix[row][column]);
         visited[row][column] = true;
         int nextRow = row + directions[directionindex][0],nextColumn = column+directions[directionindex][1];
         if(nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||visited[nextRow][nextColumn]){
             directionindex = (directionindex+1)%4;
         }
         // 判断下一个要访问的元素是否在合法的位置，否则改变方向
         row += directions[directionindex][0];
         column += directions[directionindex][1];
     }
     return result;
    }
}
