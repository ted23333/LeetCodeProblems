package Huawei22;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
   static  List<List<Integer>> edges;
    static int[] visited;
    static boolean valid = true;
    static List<Integer> res= new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        edges = new ArrayList<List<Integer>>(); ;
        for(int i = 0;i<N;i++)
        {
            edges.add(new ArrayList<Integer>());
        }

        visited = new int[N];
        valid = true;
        sc.nextLine();
        for(int i = 0;i<N;i++)
        {

            String []str = sc.nextLine().split(",");
            int T = Integer.parseInt(str[0]);
            if(T ==0) continue;

            for(int j = 1;j<=T;j++)
            {
             edges.get(i).add(Integer.parseInt(str[j]));
            }
        }

        dfs(M);
        if(valid)
        {
            Collections.sort(res);
            int size = res.size();
            System.out.print(res.get(0));
            for(int k =1;k<size;k++){
                System.out.print(","+res.get(k));
            }

        }
        else {
            System.out.println("-1");
        }


    }
    public static void dfs(int u) {
        visited[u] = 1;
        for (int v: edges.get(u)) {
            if (visited[v] == 0) {
                res.add(v);
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }


}


