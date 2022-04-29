package Tencent1;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String []readstring =new String[N];
        for(int i = 0;i<N;i++)
        {
            readstring[i] = sc.nextLine();
        }
        int len = readstring[0].length();
        int[] result = new int[len];
        String strPattern = "^0+(?!$)";
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<N;j++)
                sb.append(readstring[j].charAt(i));
            String str = sb.toString().replaceAll(strPattern, "");
            result[i] = Integer.parseInt(str);
        }
        Arrays.sort(result);
        System.out.print(result[0]);
        for (int i = 1; i < len; i++) {
            System.out.print(" "+result[i]);
        }
    }
}
