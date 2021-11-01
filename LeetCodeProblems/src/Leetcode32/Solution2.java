package Leetcode32;

import java.util.Deque;
import java.util.LinkedList;

// 使用栈来实现
class Solution2 {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                    // 最长的序列
                }
            }
        }
        return maxans;
    }
}

