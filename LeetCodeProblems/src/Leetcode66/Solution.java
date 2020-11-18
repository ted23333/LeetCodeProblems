package Leetcode66;
// 进1的方法
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // 从最后一位开始进1
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
            // 如果某一位不是10，返回结果
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

