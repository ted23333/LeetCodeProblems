package Leetcode198;
// 打家劫舍
public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        int []dp = new int[length];
        if(length==0) return 0;
        if(length==1) return nums[0];
        if(length==2) return Math.max(nums[0],nums[1] );
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2]+nums[0];
        for(int i = 3;i<length;i++)
        {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-3]+nums[i] );
        }
        return Math.max(dp[length-1],dp[length-2]);
    }
}
