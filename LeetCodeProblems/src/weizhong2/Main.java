package weizhong2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = Integer.toHexString(sc.nextInt());
        int res = 0;
        for(int t=0;t<s.length();t++)
        {
            if(Character.isLetter(s.charAt(t)))
            {
                res++;
            }
        }
        System.out.println(res);
    }
}
