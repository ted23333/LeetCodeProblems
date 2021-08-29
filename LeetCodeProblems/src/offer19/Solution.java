package offer19;
// 使用f[i][j]表示s的前i个字符和p中的前j个字符是否匹配
/*
        如果匹配的是小写字母，就应该满足f[i][j]=f[i-1][j-1]
        如果匹配的是* 可以对p的第j-1个字符匹配任意自然数次数

*/
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        // 定义dp矩阵
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    //如果是×号，看匹配情况，如果等于的话
                    // 要么舍弃当前的字符匹配前一个，相当于×号无用 f i j-2
                    // 要么向前匹配f i-1 j 类似于匹配多个
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}

