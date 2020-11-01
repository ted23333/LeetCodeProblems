package Leetcode703;

import java.util.PriorityQueue;
// 数据流中的第k大元素
// 使用最小堆来实现
/*
最小堆的特性是最小的值在上面，每次取元素O(1),O(logn)
 */
public class KthLargest {

    private PriorityQueue<Integer> queue;
    private int limit;

    public KthLargest(int k, int[] nums) {
        limit = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < limit) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }
        //每次添加元素，能添加到队列的有两种情况，一种是未到k个，另一种是比堆顶的元素大

        return queue.peek();
    }

}


