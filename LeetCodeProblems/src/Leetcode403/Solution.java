package Leetcode403;

import java.util.Arrays;
// dp[i][k]表示青蛙能否达到现在所处的石头编号i且上一次跳跃距离为k
// 青蛙过河
class Solution {
    private Boolean[][] rec;

    public boolean canCross(int[] stones) {
        int n = stones.length;
        rec = new Boolean[n][n];
        return dfs(stones, 0, 0);
    }
    // dp[i][k]=dp[j][k−1]⋁dp[j][k]⋁dp[j][k+1]
    // stones[i] -stones[j] =k
    private boolean dfs(int[] stones, int i, int lastDis) {
        if (i == stones.length - 1) {
            return true;
        }
        if (rec[i][lastDis] != null) {
            return rec[i][lastDis];
        }

        for (int curDis = lastDis - 1; curDis <= lastDis + 1; curDis++) {
            if (curDis > 0) {
                int j = Arrays.binarySearch(stones, i + 1, stones.length, curDis + stones[i]);
                if (j >= 0 && dfs(stones, j, curDis)) {
                    return rec[i][lastDis] = true;
                }
            }
        }
        return rec[i][lastDis] = false;
    }
}
