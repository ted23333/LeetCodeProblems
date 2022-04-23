package Leihuo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hp = sc.nextInt();
        int lowerHp = sc.nextInt();
        int upperHp = sc.nextInt();
        int N = sc.nextInt();
        int at[] = new int[N];
       for(int i = 0;i<N;i++)
       {
           at[i] = sc.nextInt();
       }
       int minhp = hp-lowerHp;
       int maxhp = hp-upperHp;
       int count = 0;
       int time = 0;
       while(count<maxhp)
       {
           count += at[N-1];
           time +=1;
       }
        System.out.println(time);
    }
}
