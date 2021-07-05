package Leetcode233;
// 暴力会超时，所以应该采用数学方法
public class Solution {
    int countDigitOne(int n)
    {
        int countr = 0;
        for ( long i = 1; i <= n; i *= 10) {
        long divider = i * 10;
        countr += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0.0), i);
    }
        return countr;
    }


}
