package offer44;
// 数字序列中某一位的数字
// 每个digit下的数位count计算公式为：
// count = 9×start×digit
// 确定n所在的位数，记digit 确定n所在的数字 记num 确定 n是num中的哪一数位
class Solution {
    public static void main(String[] args) {
        int n =11;
        int re = new Solution().findNthDigit(n);
    }
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit; // 2.
        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
    }
}

