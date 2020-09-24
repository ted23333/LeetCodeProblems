package Leetcode70;

public class Solution {
    // 爬第n阶楼梯的方法数量，等于爬上n-1阶和n-2阶的
    // 即dp[n] = dp[n-1]+dp[n-2]
    //dp[0] = dp[1]= 1
    public int climbStairs(int n){
        int []dp= new int[n+1];
    dp[0]=1;
    dp[1] = 1;
    for(int i=2;i<=n;i++)
    {
        dp[i] = dp[i-1]+dp[i-2];
    }
    return dp[n];
    }

}
