package tryyy;
class Solution {
    public static void main(String[] args) {
        int result = new Solution().cuttingRope(10);
    }
    public int cuttingRope(int n) {
        int []dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] =1;
        for(int i =3;i<n+1;i++)
        {
            dp[i] = -1;
            for(int j = i-1;j>0;j--)
            {
                dp[i] = Math.max(Math.max(j*(i-j),Math.max(dp[i-j]*j,dp[i-j]*dp[j])),dp[i]);
            }
        }
        return dp[n];
    }
}

