package Leetcode739;

import java.lang.reflect.Array;
import java.util.Stack;

// 每日温度
// 单调栈
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int res[]=new int[n];
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        // 没有弹出栈的元素都是没有找到下一个更大元素的
        // 保证每一个元素都能进一次栈
        // 没有弹出的元素都是0，代表没有找到更大的元素
        for(int i=1;i<n;++i)
        {
           while(!stack.isEmpty()&&T[i]>T[stack.peek()])
           // 只要栈不为空并且下一个元素比栈顶更大
           {
               int pre= stack.pop();
               res[pre]=i-pre;
               // 弹出栈顶的元素，计算差值，也就是下一个更大的元素

           }
            stack.push(i);
        }
        return res;
    }
}