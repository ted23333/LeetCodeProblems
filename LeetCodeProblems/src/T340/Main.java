package T340;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     String str = sc.next();
     if(k == 0||str.length() == 0)
     {
         System.out.println(0);
     }
        Map<Character,Integer> map  = new HashMap<>();
     int l=0,r = 0,len = 0;
     while(r< str.length())
     {
         map.put(str.charAt(r),r);
         if(map.size()>k)
         {
             int minValue = Collections.min(map.values());
             map.remove(str.charAt(minValue));
             l = minValue +1;
         }
         r++;
         len = len>r-l?len:r-l;
     }
        System.out.println(len);
    }
}
