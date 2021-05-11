package Leetcode514;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// leetcode 514 自由之路
class Solution {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        // ring 是用于查找的字符串，key是用于具体匹配的字符串
        List<Integer>[] pos = new List[26];
        for (int i = 0; i < 26; ++i) {
            pos[i] = new ArrayList<Integer>();
        // 表示第i个字符在ring中出现的集合
        }
        // 将字符串转化为对应的字母
        // 考虑需要计算的ring的第j个字符下标集合
        for (int i = 0; i < n; ++i) {
            pos[ring.charAt(i) - 'a'].add(i);
        } // 把ring里面的所有字符位置都在pos中标记出来
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(dp[i], 0x3f3f3f);
            //这是一个非常大的数，可以作为无穷大
        }
        for (int i : pos[key.charAt(0) - 'a']) {
            dp[0][i] = Math.min(i, n - i) + 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j : pos[key.charAt(i) - 'a']) {
                for (int k : pos[key.charAt(i - 1) - 'a']) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.min(Math.abs(j - k), n - Math.abs(j - k)) + 1);
                }
            }
        }
        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }
}


