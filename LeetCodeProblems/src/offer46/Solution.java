package offer46;
// 动态规划翻译
// 如果倒数两位数在10到25之间
// dp[i] = dp[i-1]+dp[i-2]
// 否则 dp[i] = dp[i-1]
class Solution {
    public int translateNum(int num) {
        int[] dp = new int[2];
        int[] nn = new int[2];
        Integer n = num;
        String str = n.toString();
        int len = str.length();
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 0; i < len; i ++) {
            nn[1] = str.charAt(i) - '0';
            if((nn[0] < 2 && nn[0] != 0) || (nn[0] == 2 && nn[1] <= 5)) {
                dp[1] += dp[0];
                dp[0] = dp[1] - dp[0];
            } else {
                dp[0] = dp[1];
            }
            nn[0] = nn[1];
        }
        return dp[1];
    }
}




