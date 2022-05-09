package Leetcode42;
// 使用dp数组实现
public class Solutionss {
    public int  trap(int []height)
    {
        int res = 0;
        int len = height.length;
        int []f_dp = new int[len];
        int []b_dp = new int[len];
        int l_max = height[0];
        int r_max = height[len-1];
        for(int i = 0;i<len;i++)
        {
            f_dp[i]=Math.max(l_max,height[i]);
            l_max = Math.max(l_max,f_dp[i]);
        }
        for(int j = len-1;j>=0;j--)
        {
            b_dp[j] = Math.max(r_max,height[j]);
            r_max = Math.max(r_max,b_dp[j]);
        }
        for(int i = 0;i<len;i++)
        {
           res += Math.min(f_dp[i],b_dp[i])-height[i];
        }
        return res;
    }
}
