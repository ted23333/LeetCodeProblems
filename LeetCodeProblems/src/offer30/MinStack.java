package offer30;

import java.util.Stack;

class MinStack {
// 维护一个栈，元素非降序即可
    /** initialize your data structure here. */
    Stack<Integer> A,B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();

    }

    public void push(int x) {
    A.add(x);
    if(B.empty()||B.peek()>=x)
        B.add(x);
    }

    public void pop() {
     if(A.pop().equals((B.peek())))
         B.pop();
    }


    public int top() {
        return A.peek();
    }

    public int min() {
     return B.peek();
    }
}
