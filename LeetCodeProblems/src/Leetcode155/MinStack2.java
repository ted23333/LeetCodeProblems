package Leetcode155;

import java.util.Stack;

// 空间复杂度为1
// 每次将元素与最小值的差值入栈
// 可能会越界
public class MinStack2 {
    Stack<Integer> stack;
    int min;
    public MinStack2() {
    stack = new Stack<>();
    }

    public void push(int val) {
     if(stack.isEmpty())
     {
         stack.push(0);
         min = val;
         return;
     }
     stack.push(val-min);
     if(val<min) min = val;
    }

    public void pop() {
   if(stack.peek()>=0) stack.pop();
   else min = min-stack.pop();
    }

    public int top() {
    if(stack.peek()>=0) return stack.peek()+min;
    else
        return min - stack.peek();
    }

    public int getMin() {
     return min;
    }
}
