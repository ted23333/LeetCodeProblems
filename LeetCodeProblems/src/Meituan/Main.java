package Meituan;

import java.util.Scanner;

// 会合
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []dis = new int[n+1];
        for(int i = 1;i<n+1;i++)
        {
            dis[i] = sc.nextInt();
        }
        int minDis = Integer.MAX_VALUE;
        int mei = dis[1];
        int tuan = dis[n];
        for(int i=1;i<n+1;i++)
        {
            int dis1 = dis[i]-mei;
            int dis2 = tuan - dis[i];
            minDis = Math.min(minDis,Math.abs(dis1-dis2));
        }
        System.out.println(minDis);
    }
}
