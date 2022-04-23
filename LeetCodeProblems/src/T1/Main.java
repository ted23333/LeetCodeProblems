package T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tmp = x;
        int weight = 1;
        while(tmp!=0)
        {
            tmp/=10;
            weight *=10;
        }
        for(int i = 0;i<=9;i++)
        {
            int num = x*10+i;
            if(num%7==0)
            {
                System.out.println(num);
                break;
            }
            num = i*weight +x;
            if(num%7==0)
            {
                System.out.println(num);
                break;
            }
        }
    }
}
