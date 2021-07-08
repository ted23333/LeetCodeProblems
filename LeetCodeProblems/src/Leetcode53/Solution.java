package Leetcode53;

public class Solution {
    public int maxSubArray(int []nums){
        int pre = 0,maxAns =nums[0];
        // 设最大结果是第一位数字
        for(int x:nums)
        {
            pre = Math.max(pre+x,x);
            // pre的值是累加的和或者是当前的值，也可以是看作x的前一个最大的值
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
