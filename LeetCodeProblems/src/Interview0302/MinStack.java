package Interview0302;


import java.util.Stack;
// 这道题要是不让两个栈元素数量一致，可能会抛出异常
class MinStack {
    Stack<Integer> A,B;
    /** initialize your data structure here. */
    public MinStack() {
     A  = new Stack<>();
     B = new Stack<>();
    }

    public void push(int x) {
      A.push(x);
      if(B.empty()||x<=B.peek())
      B.push(x);
      else B.push(B.peek());
    }

    public void pop() {
    A.pop();
    B.pop();
    }

    public int top() {
        if(A.empty()) throw new IllegalStateException(" ");
      return A.peek();
    }

    public int getMin() {
        if(B.empty()) throw  new IllegalStateException(" ");
      return B.peek();
    }
}
