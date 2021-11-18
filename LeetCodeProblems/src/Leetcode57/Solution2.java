package Leetcode57;
// 20211118
import java.util.Arrays;

public class Solution2 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

       int [][] res = new int[intervals.length+1][2];
       if(intervals.length==0)
       {res[0] = newInterval;
       return res;
       }
       int idx = -1;
       boolean flag_insert = false;
       for(int [] interval:intervals)
       {
           // 如果当前数组是空的，或者当前数组的末尾位置 可以直接将当前的区间
           // 加入到结果数组
           if(interval[1]<newInterval[0]||interval[0]>newInterval[1])
           {
               if(!flag_insert&&interval[0]>newInterval[1])
           {
               res[++idx] = newInterval;
               flag_insert = true;
           }
               res[++idx] = interval;}
           else
           {
               //否则要讨论新加入的数组的边界问题
               newInterval[0] = Math.min(newInterval[0],interval[0]);
               newInterval[1] = Math.max(newInterval[1],interval[1]);
           }
       }
       // 假如只有一组用例的话，需要考虑这种特殊情况
        if(!flag_insert)
        {
            res[++idx] = newInterval;
            flag_insert = true;
        }
       return Arrays.copyOf(res,idx+1);

    }
}
