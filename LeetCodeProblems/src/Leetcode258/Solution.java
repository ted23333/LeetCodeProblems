package Leetcode258;
// 各位相加
class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}

