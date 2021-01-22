package Leetcode232;

import java.util.Stack;

public class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;
    public MyQueue() {
    stackPop = new Stack<Integer>();
    stackPush = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!stackPop.empty())
        {
            stackPush.push(stackPop.pop());
        }
        stackPush.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      while(!stackPush.empty())
      {
          stackPop.push(stackPush.pop());
      }
       return stackPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        while(!stackPush.empty())
        {
            stackPop.push(stackPush.pop());
        }
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
     return stackPop.empty()&&stackPush.empty();
    }
}
