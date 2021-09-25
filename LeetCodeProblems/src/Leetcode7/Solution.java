package Leetcode7;
// 整数反转
// 思路：压栈 考虑溢出的问题
class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                // 如果ans可能越界 返回0
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            // 判断最小的整数和最大的整数不能超过范围
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }
}
