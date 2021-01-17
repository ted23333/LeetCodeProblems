package Leetcode402;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// 移掉k位数字
// 考虑额外处理的结果
// 如果删除了m个数字而且m<k 需要从序列尾部删除额外的k-m个数字
// 如果最终的数字序列存在 0 ，需要删除
// 如果最终数字序列为空 应该返回0
class Solution {
    public String removeKdigits(String num, int k) {
        // 定义一个双端队列
        Deque<Character> deque = new LinkedList<Character>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                k--;
            }
            // 如果双端队列的尾部的当前元素大于新插入的元素，就把队列尾部的元素删除
            deque.offerLast(digit);
            // 向双端队列的尾部插入元素
        }

        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }
        // 如果当前删除元素的个数少于k，则删除结尾的元素

        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            } // 判断第一个数字是否为0
            leadingZero = false;
            ret.append(digit);
        }
        return ret.length() == 0 ? "0" : ret.toString();
        // 如果最终元素是0的话就返回0 ，如果不是0的话将拼接的字符串转化为string类型
    }
}
