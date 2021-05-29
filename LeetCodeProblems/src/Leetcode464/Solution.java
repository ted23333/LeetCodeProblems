package Leetcode464;
// 我能赢么
// 没看懂
class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(maxChoosableInteger >= desiredTotal) return true;
        //如果最大的可选数字大于期望总和，那么先手稳赢
        if((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) return false;
        // 如果能够选择的所有数组总和小于期望总和，那么先手一定输
        return dfs(0, desiredTotal, new Boolean[1 << maxChoosableInteger], maxChoosableInteger);
     //定义一个长度为n的dp数组来存储选择与否的状态，以及这些状态对应的是赢还是输
    }

    private boolean dfs(int state, int desiredTotal, Boolean[] dp, int maxChoosableInteger){
        if(dp[state] != null){
            return dp[state];
        }

        for(int i = 1; i <= maxChoosableInteger; i++){
            int cur = 1 << (i - 1);
            // 当前数的状态
            if((cur & state) != 0){
                continue;
                // 进入下一个数的选择
            }

            if(i >= desiredTotal || !dfs(cur|state, desiredTotal - i, dp, maxChoosableInteger)){
                return dp[state] = true;
            }
            //
        }
        return dp[state] = false;
    }
}

