package Wangyi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int m = sc.nextInt();
        int [][]mat = new int[n][m];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
               mat[i][j] = sc.nextInt();
            }
        }
    }
}
