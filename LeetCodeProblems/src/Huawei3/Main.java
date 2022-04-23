package Huawei3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        int[] distance = new int[n];
        for (int i=0; i< n; i++) {
            cost[i] = sc.nextInt();
        }
        for (int i=0; i< n; i++) {
            distance[i] = sc.nextInt();

        }
        int maxDistance = sc.nextInt();


    }
    public void dfs(int []cost,int []distance, int maxDistance,int cur,int total)
    {
        int n = cost.length;
        if(cur==n-1) return;
    }
}