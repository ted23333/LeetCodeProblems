package offer59;
// 维护一个单调的双端队列

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// 实现一个队列 插入元素 删除元素 以及查找最大元素都是O(1)的复杂度
// 方法：维护一个单调的双端队列
// 在插入每一个元素的时候，从队列尾部依次取出比当前元素value小的元素
// 直到遇到一个比当前元素大的元素value即可
// 保证队列是单调递减的

public class MaxQueue {
   Queue<Integer> q;
   Deque<Integer> d;
    public MaxQueue() {
    q = new LinkedList<Integer>();
    d = new LinkedList<Integer>();
    }

    public int max_value() {
      if(d.isEmpty()) {
          return -1;
      }
      return d.peekFirst();
      // 双端队列的第一个元素就是最大值
    }

    public void push_back(int value) {
        while(!d.isEmpty()&&d.peekLast()<value){
            d.pollLast();
        }
        // 这样做可以维持一个单调递减的队列
        // 新加入的元素如果比末尾元素大，那么就把双端队列末尾的元素弹出
        d.offerLast(value);
        q.offer(value);
    }

    public int pop_front() {
        if(q.isEmpty())
        {
            return -1;
        }
        int ans = q.poll();
        if(ans == d.peekFirst()){
            d.pollFirst();
        }
        // 如果元素弹出的和双端队列中的一致，那么也把双端队列中的元素一并弹出
        return ans;
    }
}
