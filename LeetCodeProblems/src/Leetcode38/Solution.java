package Leetcode38;
// 外观数组
// 这道题的的java解法可能有点问题
class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; ++i) {
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int pos = 0;

            while (pos < str.length()) {
                while (pos < str.length() && str.charAt(pos) == str.charAt(start)) {
                    pos++;
                }
                sb.append(Integer.toString(pos - start)).append(str.charAt(start));
                start = pos;
                // pos向前推进位置 start是前一个字符的位置
            }
            str = sb.toString();
            /*每次更新str*/
        }

        return str;
    }
}
