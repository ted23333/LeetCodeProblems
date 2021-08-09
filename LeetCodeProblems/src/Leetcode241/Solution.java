package Leetcode241;

import java.util.ArrayList;
import java.util.List;

// 为运算表达式设计优先级
// 使用分治算法
// 给定含有数字和运算符的字符串，为表达式添加括号，改变运算优先级求出不同的结果
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        int len = expression.length();
        int start = 0;
        for (start = 0; start < len; start++) {
            if(Character.isDigit(expression.charAt(start))) continue;
            else break;
        }
        if(start==len) list.add(Integer.parseInt(expression));
        // 如果表达式参数中不包含运算符，直接将表达式解析为数字
        for (int i = start; i < len; i++) {
            if(Character.isDigit(expression.charAt(i))) continue;
            char op = expression.charAt(i);
            List<Integer> left = diffWaysToCompute(expression.substring(0,i));
            List<Integer> right = diffWaysToCompute(expression.substring(i+1,len));
            // 分治策略，将表达式划分为运算符左侧和运算符右侧
            for (int j : left){
                for (int k : right){
                    if(op=='+') list.add(j+k);
                    else if(op == '-') list.add(j-k);
                    else if(op == '*') list.add(j*k);
                }
            }
        }
        return list;
    }
}
