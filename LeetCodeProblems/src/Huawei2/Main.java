package Huawei2;

import java.util.Scanner;

public class Main {
    static int mintime = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        char [][]mat = new char[M][N];
        int rs = 0,cs =0,re=0,ce=0;
        for(int i=0;i<M;i++)
        {
           String str = sc.nextLine();
           char []char_in_str = str.toCharArray();
           for(int j = 0;j<N;j++)
           {
               mat[i][j] = char_in_str[j];
               if(mat[i][j]=='S')
               {
                   rs = i;
                   cs = j;
               }
           }
        }
        dfs(mat,rs-1,cs,1,0);
        dfs(mat,rs+1,cs,1,1);
        dfs(mat,rs,cs+1,1,2);
        dfs(mat,rs,cs-1,1,3);
        System.out.println(mintime);


    }
    public static void dfs(char [][]mat,int r,int c,int currenttime,int dir)
    {
        int mr = mat.length;
        int mc = mat[0].length;
        if(r<0||c<0||r>=mr||c>=mc||mat[r][c]=='X'||mat[r][c]=='S') return ;
        if(mat[r][c]=='E')
        {
            mintime =Math.min(currenttime,mintime);
        }
        if(mat[r][c]=='B')
        {
            mat[r][c] = 'X';
            dfs(mat,r-1,c,currenttime+1+((dir==0)?0:1),0);
            dfs(mat,r+1,c,currenttime+1+((dir==1)?0:1),1);
            dfs(mat,r,c+1,currenttime+1+((dir==2)?0:1),2);
            dfs(mat,r,c-1,currenttime+1+((dir==3)?0:1),3);
            mat[r][c] = 'B';
        }
    }
}
