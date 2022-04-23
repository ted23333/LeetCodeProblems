package T3ali;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static class Line{
        public int A;
        public int B;
        public int count;
        public Line(int A,int B)
        {
            this.A = A;
            this.B = B;
        }
@Override
       public int hashCode(){
         long aL = A<< 32;
         long bL = B;
         return  Long.valueOf(aL + bL).hashCode();
       }
    }
    private static int countPoint(int [][] lines){
        Map<Line,Integer> map  = new HashMap<>();
        for(int []line:lines)
        {
            int g = gcd(line[0],line[1] );
            int A = line[0]/g;
            int B = line[1]/g;
            Line line1 = new Line(A,B);
            map.putIfAbsent(line1,0);
            map.compute(line1,(k,v)->v+1);
        }
        Integer [] count = new Integer[map.size()];
        int i = 0;
        for(Map.Entry<Line,Integer> entry:map.entrySet()){
            count[i++] = entry.getValue();
        }
        Arrays.sort(count);
        int a = 0,b = 0;
        for (int j = 0;j<count.length;j++)
        {
            if(j%2==0)
            {
                a +=count[j];
            }
            else{
                b += count[j];
            }
        }
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] lines = new int[n][3];

       for(int i = 0;i<n;i++)
       {
           for(int j = 0;j<3;j++)
           {
               lines[i][j] = sc.nextInt();
           }
       }
        System.out.println(countPoint(lines));
    }
}
