package offer59_1;

import java.util.Deque;
import java.util.LinkedList;



// 滑动窗口的最大值
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        if(n==0||k==0) return new int[k];
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        // 注意这里的写法
        // 先形成一个单调队列


        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }

        return ans;
    }
}


