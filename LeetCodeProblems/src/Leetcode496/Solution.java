package Leetcode496;

import java.util.HashMap;
import java.util.Stack;

// 下一个更大元素Ⅰ
public class Solution {
    // 先找到nums2中每一个元素的最大值
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      // 使用一个单调栈来实现 栈顶到栈底的元素是单调不减的
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int[nums1.length];
        for(int i = 0;i<nums2.length;i++)
        {
            while(!stack.isEmpty()&&nums2[i]>stack.peek())
                map.put(stack.pop(),nums2[i]);
            // 寻找下一个更大的元素
            stack.push(nums2[i]);
        }
        while(!stack.empty())
            map.put(stack.pop(),-1);
        for(int i= 0;i<nums1.length;i++)
        {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
