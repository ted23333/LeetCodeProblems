package Leetcode96;
//不同的二叉搜索树
// 使用动态规划求解
// G(n) =Σ(i=1~n)G(i-1)G(n-i)
class Solution {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        // 使用数组存储G数组的值
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}


