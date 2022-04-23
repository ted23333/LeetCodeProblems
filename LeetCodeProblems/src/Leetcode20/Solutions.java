package Leetcode20;

import java.util.Stack;

class Solutions {
    public static void main(String[] args) {
    String s ="abcd";
        System.out.println(s.substring(0,1));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for(int i = 0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch == '[') stack.push(ch);
            else switch(ch)
            {

                case ')':{
                    if(stack.isEmpty()||stack.peek()!='(') return false;
                    else stack.pop();
                    break;
                }
                case '}':{
                    if(stack.isEmpty()||stack.peek()!='{') return false;
                    else stack.pop();
                    break;
                }
                case ']':{
                    if(stack.isEmpty()||stack.peek()!='[') return false;
                    else stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }
}
