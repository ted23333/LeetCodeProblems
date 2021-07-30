package Leetcode65;
// valid number
class Solution {
    // 有效数字中有两个标识符
    // 一个e或者E 区分科学计数法和普通数字
    // 小数点 区分小数和整数
    /* 遍历查找e和E的位置
    没有e或者E 标识符设置到末尾
    有且只有一个e或者E，且位置不在开头和结尾，可以将数字分为两部分，前面是小数或者整数，后面是整数
    不止一个e，非法

    在前半段查找小数点 同样有三种情况
    没有小数点 那就是整数，把小数点标识符号设置在末尾
    有且只有一个小数点，说明是一个小数，记录其位置
    不止一个小数点 非法

    整数的情况 有没有正负号 正负号是不是只有一个 是否至少有一位数字
    对小数分情况讨论 有没有正负号，是不是有且只有一个 小数点前后至少一个位置有数字





    */
    public boolean isNumber(String s) {

        char[] ss = s.toCharArray();
        int n = ss.length;

        // 先检测是否有 e
        int e = n;
        for (int i = 0; i < n; ++i) {
            if (ss[i] == 'e' || ss[i] == 'E') {
                if (e != n) // 两个 e 不合法
                    return false;
                else
                    e = i;
            }
        }

        // e 前面没东西，不合法
        if (e == 0)
            return false;

        // 然后检查 e 前面 是否有小数点
        int dot = e;
        for (int i = 0; i < e; ++i) {
            if (ss[i] == '.') {
                if (dot != e) // 两个小数点 不合法
                    return false;
                else
                    dot = i;
            }
        }

        int c = 0;
        // e前面没有小数点，那就是整数
        if (dot == e) {
            // 整数第一位可能是符号位
            if (ss[c] == '+' || ss[c] == '-') {
                ++c;
                // 只有一个符号位也是不行的
                if (c == dot)
                    return false;
            }
            // 剩下部分应该全是数字
            while (c < dot) {
                int tmp = ss[c++] - '0';
                if (tmp < 0 || tmp > 9)
                    return false;
            }
        }
        // e前面有小数点那就是小数了，范围是 [c,e)
        else {
            // 小数第一位可能是符号位
            if (ss[c] == '+' || ss[c] == '-')
                ++c;
            // 先考虑第三种情况：一个点 '.' ，后面跟着至少一位数字
            if (c == dot) {
                // 小数点后面没有数字，不合法！
                if ((c++) + 1 == e)
                    return false;
                while (c < e) {
                    int ttt = ss[c++] - '0';
                    if (ttt < 0 || ttt > 9)
                        return false;
                }
            }
            // 情况2：至少一位数字，后面跟着一个点 '.'
            // 情况3：至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
            else {
                // [c, dot) 应该都是数字
                while (c < dot) {
                    int ttt = ss[c++] - '0';
                    if (ttt < 0 || ttt > 9)
                        return false;
                }
                // (dot,e) 也应该是数字
                c = dot + 1;
                while (c < e) {
                    int ttt = ss[c++] - '0';
                    if (ttt < 0 || ttt > 9)
                        return false;
                }
            }
        }

        // e 后面肯定是整数
        // e 是字符串最后一位，不行!
        if (++e == n)
            return false;
        // 整数可能有一位符号位
        if (e < n && (ss[e] == '+' || ss[e] == '-')) {
            // 只有一个符号位也是不行的
            if (++e == n)
                return false;
        }
        // 剩下的应该全部是数字
        while (e < n) {
            int sss = ss[e++] - '0';
            if (sss < 0 || sss > 9)
                return false;
        }

        return true;
    }
}
