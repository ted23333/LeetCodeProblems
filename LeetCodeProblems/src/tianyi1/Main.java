package tianyi1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int [][]pair  = new int[num][2];
        for(int i = 0;i<num;i++)
        {
            String []str = sc.nextLine().split(",");
            pair[i][0] = Integer.parseInt(str[0]);
            pair[i][1] = Integer.parseInt(str[1]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<num;i++)
        {
            int l = pair[i][0];
            int r = pair[i][1];
            for(int t = l+1;t<=r;t++)
            {
                map.putIfAbsent(t,0);
                map.compute(t,(k,v)->v+1);
            }
        }
        int cout = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1) cout++;
        }
        System.out.println(cout);

    }
}
