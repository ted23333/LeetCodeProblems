package tianyi3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int vl = sc.nextInt();
        int v[] = new int[vl];
        for(int i = 0;i<vl;i++)
        {
            v[i] = sc.nextInt();
        }
        int cl = sc.nextInt();
        int c[] = new int[cl];
        for(int i = 0;i<cl;i++)
        {
            c[i] = sc.nextInt();
        }
        System.out.println(dp(j,cl,c,v));
    }
    public static int calMax(int c[],int v[],int j)
    {
        j = j+1;
        int num[][] = new int[c.length][j];
        for(int i = 0;i<c.length;i++)
        {
            num[i][0] = 0;
        }
        for(int i = 0;i<j;i++)
        {
            num[0][i] =0;
        }
        for(int i = 1;i<c.length;i++)
        {
            for(int k=1;k<j;k++)
            {
                num[i][k] = num[i-1][k];
                if(k>=v[i])
                {
                    num[i][k] = Math.max(num[i][k],c[i]+num[i][k-v[i]]);
                }
            }
        }
        return num[c.length-1][j-1];
    }
    public static int dp(int a,int n,int []weights,int []values)
    {
        int [][]map = new int[a+1][n+1];
        for(int i = 1;i<=n;i++)
        {
            int value = values[i-1];
            int weight = weights[i-1];
            for(int j =1;j<=a;j++)
            {
                if(j<weight)
                {
                    map[j][i] = map[j][i-1];
                    continue;
                }
                map[j][i] = Math.max(map[j][i-1],map[j-weight][i-1]+value);
            }
        }
        return map[a][n];
    }
}
