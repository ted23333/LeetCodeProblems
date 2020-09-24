package Leetcode202;

import java.util.HashSet;
import java.util.Set;
// 202 快乐数
// 算法可以分为两部分
// 第一部分是通过给定的数字，判断下一个数字是什么
// 第二部分是判断这些数字的变化是不是进入了一个循环 如果进入了一个循环，那么永远都得不到最后的结果1
public class Solution {
    private int getNext(int n){
        int totalSum =0;
        while(n>0){
            int d = n%10;
            n=n/10;
            totalSum+=d*d;
        }
        return totalSum;
    }
    public boolean isHappy(int n){
        Set<Integer> seen  = new HashSet<>();
        while(n!=1&&!seen.contains(n))
        {
            seen.add(n);
        n = getNext(n);

        }
        return n==1;
    }
}
