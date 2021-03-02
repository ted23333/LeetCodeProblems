package Leetcode503;

import java.util.Stack;

// 下一个更大的元素Ⅱ
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> stack = new Stack<>();
      int []result = new int[nums.length];
      // 循环数组可以让每个元素
      for(int i = 2* nums.length - 1;i>=0;--i)
      {
          while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i%nums.length]){
              stack.pop();
          }
          result[i%nums.length] = stack.empty()?-1:nums[stack.peek()];
          stack.push(i% nums.length);

      }
      return result;
    }
}
