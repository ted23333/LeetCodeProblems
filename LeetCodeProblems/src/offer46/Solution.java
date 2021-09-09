package offer46;
// 动态规划翻译
// 如果倒数两位数在10到25之间
// dp[i] = dp[i-1]+dp[i-2]
// 否则 dp[i] = dp[i-1]
// 采用滚动数优化
class Solution {
    public int translateNum(int num) {
        String src = String.valueOf(num);
        int p = 0, q = 0, r = 1;
        //使用 p q r 进行存储
        for (int i = 0; i < src.length(); ++i) {
            p = q;
            q = r;
            r = 0;
            r += q;
            if (i == 0) {
                continue;
            }
            String pre = src.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                r += p;
            }
        }
        return r;
    }
}




