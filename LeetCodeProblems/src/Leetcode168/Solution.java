package Leetcode168;
// excel表列名称
class Solution {
    public String convertToTitle(int columnNumber) {
        // 相当于26进制的转化
        StringBuffer sb = new StringBuffer();
        while (columnNumber != 0) {
            columnNumber--;
            // 对应到26进制的时候需要首先将现有的数字减去1
            // 因为是从1开始算的
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
            // 然后再加上
        }
        return sb.reverse().toString();
    }
}
