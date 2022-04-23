package mihayou3;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char [][]mat = new char[n][m];
        ArrayList<int[]> flow = new ArrayList<>();
        ArrayList<int []> meat = new ArrayList<>();
        ArrayList<int[]> fire = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            String str= sc.nextLine();
            char []arr = str.toCharArray();
            int mi=0,mj=0;
            // 算 起始点到所有花和肉的距离
            for(int j = 0;j<m;j++)
            {
                mat[i][j] = arr[m];
                if(arr[m]=='#') flow.add(new int[]{i,j});
                if(arr[m] == '$') meat.add(new int[]{i,j});
                if(arr[m ]== '^') fire.add(new int[]{i,j});
            }
        }

    }
}
