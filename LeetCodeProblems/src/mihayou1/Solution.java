package mihayou1;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int sum = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<len;i++)
        {
            char c = str.charAt(i);
            if(i==0) stack.push(c);
            if(c =='('||c=='['||c=='{') stack.push(c);
            else if(c==')'&&stack.peek()=='(') {
                sum +=1;
                stack.pop();
            }
            else if(c==']'&&stack.peek()=='[')
            {
                sum +=2;
                stack.pop();
            }
            else if(c=='}'&&stack.peek()=='{')
            {
                sum +=3;
                stack.pop();
            }
            else stack.push(c);
        }
        System.out.println(sum);
    }
}
