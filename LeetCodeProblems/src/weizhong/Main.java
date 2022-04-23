package weizhong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p[] = new int[n];
        int res = 0;
        for(int i = 0;i<n;i++)
        {
           p[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
           int left = Math.max(i-x,0);
           int right = Math.min(i+y,n-1);
           boolean flag = true;

           for(int po = left;po<=right;po++)
           {
               if(po==i) continue;
               if(p[po]<p[i])
               {
                   flag = false;
               break;
               }
           }
            if(flag) {res = i;break;}
        }
        System.out.println(res+1);
    }
}
