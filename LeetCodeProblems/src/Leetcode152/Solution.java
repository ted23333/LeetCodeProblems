package Leetcode152;
// 乘积最大的子数组 有一个用例过不去
public class Solution {
    public int maxProduct(int[] nums) {
      int n = nums.length;
      int maxvalue = Integer.MIN_VALUE;
       int dp[][] = new int[n][n];
       for(int i= 0;i<n;i++)
           for(int j = i;j<n;j++)
           {
               if(i==j) dp[i][j] = nums[i];
               else dp[i][j] = dp[i][j-1]*nums[j];
               maxvalue = Math.max(dp[i][j],maxvalue);
           }
       return maxvalue;
    }
}
