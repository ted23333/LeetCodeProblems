package offer58_1;

public class Solution {
    public String reverseWords(String s) {
// 倒序遍历字符串
        s = s.trim();
        // 删除首尾的空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            // 搜索第一个空格
            res.append(s.substring(i + 1, j + 1) + " ");
            // 添加第一个字符
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
            // 寻找下一个字符的末尾字符 每次都让j指向最后一个字符
        }
        return res.toString().trim();
    }
}
