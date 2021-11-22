package Leetcode71;

import sun.awt.image.ImageWatched;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringJoiner;

// 20211122
// 模拟栈
// 多个连续斜杠转化为一个斜杠
// 栈中不存储斜杠 只存储文件名 因为多个斜杠不方便处理
public class Solution2 {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        int n = path.length();
        int i = 0;
        StringBuilder str = new StringBuilder();
        while(i<n)
        {
           if(path.charAt(i)=='/') ++i;
           // 遇到斜杠一直向后，直到非斜
            else {
                for(;i<n&&path.charAt(i)!='/';++i)
                {
                    str.append(path.charAt(i));
                }
                 if(str.toString().equals("."));
                else if(str.toString().equals(".."))
                {
                    if(!stack.isEmpty()) stack.pollLast();
                }
                else stack.offerLast(str.toString());
                // 此处要置空，留给下一次使用
                str = new StringBuilder();
           }
        }
        if(stack.isEmpty()) return "/"; // 栈为空表示是空目录
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
        {
            ans.append("/");
            ans.append(stack.pollFirst());
        }
        return ans.toString();

    }
}
