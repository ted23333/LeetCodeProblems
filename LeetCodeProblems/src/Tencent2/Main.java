package Tencent2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int []a = new int[n+1];
        for(int i = 1;i<=n;i++)
        {
            a[i] = sc.nextInt();
        }
        int [][]dp = new int [n+1][n+1]; // 第一个n+1代表天数，第二个n+1代表持有的股票手数
        int [][] zc = new int[n+1][n+1];
        dp[0][0] = m; zc[0][0] = m;
        for(int i = 0;i<=n;i++)
        {
            for(int j = i+1;j<=n;j++)
            {
                zc[i][j] = Integer.MIN_VALUE;
            }
        }
        for(int i = 1;i<=n;i++)
        {
            dp[i][0] = m;
            zc[i][0] = m;
            int in,out;
            for(int j = 1;j<=i;j++)
            {
               if(zc[i-1][j-1]-a[i]>=0)
               {
                   in = zc[i-1][j-1]-a[i];}
               else
                   in = Integer.MIN_VALUE;
               if(i-j>=2)
                   out = zc[i-1][j+1]+a[i];
               else
                   out = Integer.MIN_VALUE;
               int t1=in+j*a[i],t2=out+j*a[i],t3 = zc[i-1][j]+j*a[i];
               if(t1>=t2&&t1>=t3)
               {
                   dp[i][j] = t1;
                   zc[i][j] = in;
               }
               else if(t2>t1&&t2>=t3)
               {
                   dp[i][j] = t2;
                   zc[i][j] = out;
               }
                else
               {
                   dp[i][j] = t3;
                   zc[i][j] = zc[i-1][j];
               }
            }
        } // 初始化
        int maxvalue = Integer.MIN_VALUE;
       for(int k = 0;k<=n;k++)
       {
           maxvalue = Math.max(maxvalue,dp[n][k]);
       }
        System.out.println(maxvalue);
    }
}
