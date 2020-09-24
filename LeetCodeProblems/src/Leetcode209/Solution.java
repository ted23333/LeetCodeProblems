package Leetcode209;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        //用一个队列（或者说是滑动窗口）来维持这个s长度的子串
        // 分别用lo 和 hi 控制队列里面的元素
        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        while (hi < nums.length) {
            sum += nums[hi++];
            while (sum >= s) {
                min = Math.min(min, hi - lo);
                sum -= nums[lo++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

