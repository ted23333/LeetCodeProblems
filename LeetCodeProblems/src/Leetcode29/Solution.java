package Leetcode29;
// 两数相除
class Solution {
    public int divide(int a, int b) {
        // a除b
        long x = a, y = b;
        boolean isNeg = false;
        if ((x > 0 && y < 0) || (x < 0 && y > 0)) isNeg = true;
        if (x < 0) x = -x;
        if (y < 0) y = -y;
        // 通过变换将负数变成正数
        long l = 0, r = x;
        // 使用二分法来解决，范围是0到x
        while (l < r) {
            // 这么写相当于左闭右开
            long mid = l + r + 1 >> 1;
            if (mul(mid, y) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        long ans = isNeg ? -l : l;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return (int)ans;
    }
    long mul(long a, long k) {
        // a代表要试的数 k是除数
        long ans = 0;
        while (k > 0) {
            if ((k & 1) == 1) ans += a;
            //&1代表是不是奇数，如果
            k >>= 1;
            a += a;
        }
        return ans;
    }
}


