package Leetcode50;
// 矩阵快速幂
public class Solution {
    public double myPow(double x, int n) {
        if(x == 0.0f) return 0.0d;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
     // 如果幂是负数，就把底数转化为倒数，把幂转化为正数
        while(b > 0) {
            if((b & 1) == 1)   //如果b是奇数
                res *= x;   //需要拆出来一个x
            x *= x;    // x变成原来的平方
            b >>= 1;  // b除以2
        }
        return res;
    }
}
