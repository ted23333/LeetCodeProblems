package Leetcode338;
// 比特位计数
// 计算1比特数的算法 令x = x&（x-1）知道变成0 操作的次数就是一比特数
// 没有特别懂里面的思路
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
}


