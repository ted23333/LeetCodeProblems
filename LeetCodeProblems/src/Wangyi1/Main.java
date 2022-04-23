package Wangyi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int time = 0;
        if(x>2*y)
        // 单体伤害足够高
        {
            while(a>0)
            {
                a -= x;
                time++;
            }
            while(b>0)
            {
                b -=x;
                time++;
            }
        }
//        else if(x == 2*y)
//        {
//
//        }
        else if(x<=y)
        {if(Math.max(a,b)%y==0) time = Math.max(a,b)/y;
            else time = Math.max(a,b)/y+1;}
        else
        {
         while(a>0||b>0)
         {
             a -=y;
             b -=y;
             time++;
         }
         int remains = Math.max(a,b);
         while(remains>0)
         {
             remains -=x;
             time ++;
         }

        }
        System.out.println(time);
    }
}
