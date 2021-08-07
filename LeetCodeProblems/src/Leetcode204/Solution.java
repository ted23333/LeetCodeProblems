package Leetcode204;

import java.util.Arrays;

// 计数质数
// 埃氏筛子
class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    // 从i*i进行标记，才有意义
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                        // 标记i的倍数是合数
                    }
                }
            }
        }
        return ans;
    }
}

