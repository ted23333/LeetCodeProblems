package Leetcode682;
// 棒球比赛
import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops)
    {
        Stack<Integer> stack = new Stack<>();
        for(String op:ops){
            if(op.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else stack.push(Integer.valueOf(op));
            // 这里注意要将字符串类型的转化为整数类型


    }
        int ans =0;
        for(int score:stack) ans += score;
        return ans;
}
}
