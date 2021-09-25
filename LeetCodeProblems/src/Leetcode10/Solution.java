package Leetcode10;
// 正则表达式匹配

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        // 待匹配的字符串
        int n = p.length();
        // 正则表达式的样式
        boolean f[][] = new boolean[m + 1][n + 1];
        // 状态空间
        f[0][0] = true;//f[0][0]代表s和p均为空字符串，f[1][1]代表s和p的第一个字符（即在s和p中下标为0的字符）
        // 看p[j] 如果p[j]不是星号 那么匹配成功，就等于f[i-1][j-1] 不成功直接false
        // 如果是星号 向前匹配p的前一位 i 和j-1
        for(int i = 0; i <= m ; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(p.charAt(j - 1) == '*') {//p的第j个字符为* 那么要么留着要么扔掉
                    if(matches(s, p, i, j - 1)) {//匹配s的第i个字符和p的第j-1个字符
                        f[i][j] = f[i - 1][j] || f[i][j - 2];//等的话p中*前面的字符在s中出现多次或者在s中只出现1次
                    }
                    else {
                        f[i][j] = f[i][j - 2];//不等意味着p中*前面的在s中字符出现0次
                    }
                }
                else {//p的第j个字符不为*
                    if(matches(s, p, i, j)) {//匹配s的第i个字符和p的第j个字符
                        f[i][j] = f[i - 1][j - 1];//匹配成功，状态转移；匹配不成功，默认是false
                    }
                }
            }
        }
        return f[m][n];
    }
    //负责对两个字符串进行比较，对i所在位置和j所在位置来比较
    private boolean matches(String s, String p, int i, int j) {//注意在字符串中的下标变换
        if(i == 0) {
            return false;
        }
        if(p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
