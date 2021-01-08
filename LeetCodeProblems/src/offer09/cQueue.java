package offer09;

import java.util.Deque;
import java.util.LinkedList;

// 使用栈实现两个双向队列
// 完成两个功能，在尾部加入新的元素，在队列头部删除整数
class CQueue {
   Deque<Integer> stack1;
   Deque<Integer> stack2;
    public CQueue() {
       stack1 = new LinkedList<Integer>();
       stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
       stack1.push(value);
    }

    public int deleteHead() {
    if(stack2.isEmpty())
    {// 如果第二个栈为空
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
            // 为空的话就把第一个栈的元素全部弹到第二个栈里
        }
    }
        if(stack2.isEmpty()){
            return -1;
        }
        else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
