package Leihuo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int [][]matrix = new int[6][6];
        sc.nextLine();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<6;j++)
            {
                String str= sc.nextLine();
                for(int k = 0;k<str.length();k++)
                {
                    matrix[j][k] = Integer.parseInt(str.substring(k,k+1));
                }
            }
          if(islegal(matrix)) result++;
        }
        System.out.println(result);
    }
    public static boolean islegal(int [][]matrix)
    {
        for(int i = 0;i<6;i++)
        {
            int r = 0;
            for(int j = 0;j<6;j++)
            {
                r +=matrix[i][j];
            }
            if(r!=21) return false;
        }
        for(int j = 0;j<6;j++)
        {
            int c = 0;
            for(int i = 0;i<6;i++)
            {
                c +=matrix[i][j];
            }
            if(c!=21) return false;
        }
        return true;
    }
}
