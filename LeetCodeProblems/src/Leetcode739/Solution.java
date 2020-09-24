package Leetcode739;

import java.lang.reflect.Array;
import java.util.Stack;

// 每日温度
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int res[]=new int[n];
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        for(int i=1;i<n;++i)
        {
           while(!stack.isEmpty()&&T[i]>T[stack.peek()])
           {
               int pre= stack.pop();
               res[pre]=i-pre;

           }
            stack.push(i);
        }
        return res;
    }
}