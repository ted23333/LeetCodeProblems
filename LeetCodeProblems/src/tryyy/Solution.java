package tryyy;


import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[]args){
       int []set = {1,3,2,3};
       int re = result(set);
       System.out.println(re);
    }

    public static  int result(int []set)
    {

        int sum = 0;
        HashSet<Integer> distinct =new HashSet<>();
        int s_length = set.length;
        if(s_length==0) return 0;
        sum =1;
        distinct.add(set[0]);
        for(int i = 1;i<s_length;i++)
        {
            if(!distinct.contains(Integer.valueOf(set[i])))
            {
                distinct.add(set[i]);
            }
                sum += distinct.size()*(i+1);
        }
        return sum;
    }
}
