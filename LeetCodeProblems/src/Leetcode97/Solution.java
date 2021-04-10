package Leetcode97;
// 交错字符串
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
   int n = s1.length();
   int m = s2.length();
   int t = s3.length();
   if(m+n!=t) return false;
   boolean [][]f  = new boolean[n+1][m+1];
   f[0][0] = true;  // 边界条件
   // f[i][j] 表示s1 的前i个元素和s2的前j个元素和s3 的前i+j个元素能否相等
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                // 双层循环
                int p = i + j - 1;
                if (i > 0) {
                    f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

       return f[n][m];
    }
}
