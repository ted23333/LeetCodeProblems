package Meituan1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int []nums = new int[3];
        for(char c: s.toCharArray())
        {
            if(c == 'a')
            {
                nums[0] +=1;
            }
            else if( c =='b' )
            {
                nums[1] +=1;
            }
            else if(c =='c') nums[2] +=1;
        }
        int result = Math.min(Math.min(nums[0]-1,nums[1]),nums[2]/3);
        System.out.println(result);
    }

}
