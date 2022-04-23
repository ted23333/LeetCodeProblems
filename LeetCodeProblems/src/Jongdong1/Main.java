package Jongdong1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        // 读入T组数据 每组数据两行 第一行是该组数据长度，第二行是数据的具体数值 用空格分隔
        for(int k = 0;k<T;k++)
        {
             int len1 = Integer.parseInt(reader.readLine());

            int []arr1 = new int[len1];
             String []str = reader.readLine().split(" ");
             //System.out.println(str.length);
            for(int i =0;i<len1;i++)
            {
                arr1[i] = Integer.valueOf(str[i]);
            }

            System.out.println(cal(arr1,len1));


        }

    }
    // 题目是求每组数据中元素差值的最小
    public static int cal(int arr1[],int len1)
    {
        Arrays.sort(arr1);
        int ans = 0;
        for(int i = 1;i<len1;i++)
        {
            ans = Math.min(arr1[i]-arr1[i-1],ans);
        }
        return ans;


    }
}
