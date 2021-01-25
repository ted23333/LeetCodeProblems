package Leetcode456;

import java.util.Stack;

// 132模式   i j k ai<ak<aj
/**

 思路
 1.如果数组长度小于3，直接返回false（寻找132模式）
 2.将每个元素前面的最小值，放入数组min
 3.从后往前遍历，首先满足条件 3>1（一定满足3>=1，排除3=1的情况）
 4.while循环确保条件2>1,只要有2<=1的情况，直接出栈
 5.只要栈非空，说明同时满足3>1 且2>1，一旦满足2<3，返回true
 6.其余情况直接入栈
 */
public class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        Stack< Integer > stack = new Stack < > ();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        // 这一步得到每个元素前面的最小值存储在min数组里面
        for (int j = nums.length - 1; j >= 0; j--) {
            // 此处从后往前遍历
            if (nums[j] > min[j]) {
               // 如果所在元素的前面的最小值小于该元素，即有当前的i<j
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                // 维护一个单调递减的栈
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
                // 看是否满足条件
            }
        }
        //
        return false;
    }
}

