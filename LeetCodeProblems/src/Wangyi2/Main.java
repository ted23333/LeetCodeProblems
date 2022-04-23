package Wangyi2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        if(n<=1) {
            System.out.println(0);
        return;}
        int []dp = new int[n];
        dp[0] = 0;
        if(isPair(str,0,1)) dp[1] = score(str,0,1);
        for(int i = 2;i<n;i++)
        {
            if(isPair(str,i-1,i))
            dp[i] = Math.max(dp[i-1],dp[i-2]+score(str,i-1,i));
            else dp[i] = dp[i-1];
        }
        System.out.println(dp[n-1]);

    }
    public static int score(String str,int i,int j)
    {
        char ii = str.charAt(i);
        char jj = str.charAt(j);
        return jj-'a'+1+ii-'a'+1;
    }
    public static boolean isPair(String str,int i,int j)
    {
        char ii = str.charAt(i);
        char jj = str.charAt(j);
        if(ii==jj||ii-jj==1||jj-ii==1) return true;
        else return false;
    }


}
