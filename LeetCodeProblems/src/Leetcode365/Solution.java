package Leetcode365;
// 水壶问题
// 贝祖定理
/*
如果a和b的最大公约数是d 那么存在整数x和y使得ax+by =d
只需判断z是不是x和y的最大公约数就行了
 */
class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        return z % gcd(x, y) == 0;
    }

    public int gcd(int x, int y) {
        int remainder = x % y;
        while (remainder != 0) {
            x = y;
            y = remainder;
            remainder = x % y;
        }
        return y;

        // 辗转相除法
    }
}

