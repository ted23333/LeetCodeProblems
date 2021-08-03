package Leetcode172;
// 阶乘后的0，这种就是数有多少个5就可以了，注意这里25相当于两个5
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

}
