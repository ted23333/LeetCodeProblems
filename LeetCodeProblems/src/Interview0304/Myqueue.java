package Interview0304;

import java.util.Stack;

// 使用两个栈来模拟一个队列
class MyQueue {
     Stack<Integer> A,B;
    /** Initialize your data structure here. */
    public MyQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!B.empty())
            A.push(B.pop());
      A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
     while(!A.empty())
         B.push(A.pop());
     return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        while(!A.empty())
            B.push(A.pop());
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
         if(A.empty()&&B.empty()) return true;
         else return false;
    }
}
