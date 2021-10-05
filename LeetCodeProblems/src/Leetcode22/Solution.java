package Leetcode22;
import java.util.LinkedList;
import java.util.List;

//20211005
public class Solution {
    // 动态规划求解
    // 对于i = n的情况，相当于在i= n-1的情况下添加了一组括号
    // （ p组合）+q组合  p+q = n-1
    public List<String> generateParenthesis(int n) {
        LinkedList<LinkedList<String>> result = new LinkedList<LinkedList<String>>();
        if (n == 0)
            return new LinkedList<>();
        LinkedList<String> list0 = new LinkedList<String>();
        list0.add("");
        result.add(list0);
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("()");
        result.add(list1);
        // 初始化n=0和n=1的基本情况
        for (int i = 2; i <= n; i++) {
            LinkedList<String> temp = new LinkedList<String>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                        // 二重循环遍历
                    }
                }

            }
            result.add(temp);
        }
        return result.get(n);
    }
}
