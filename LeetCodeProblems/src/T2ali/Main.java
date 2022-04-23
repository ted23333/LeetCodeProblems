package T2ali;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashSet<String> hs = new HashSet<>();
        Main m = new Main();
        for(int i =0;i<t;i++)
        {
           String str = sc.next();
           if(str.length()<6||str.length()>12)
           {System.out.println("illegal length");}
           // 长度不合理
           else if(!m.allChar(str))
            {
                System.out.println("illegal charactor");
            }
            // 字符不合理
           else if(hs.contains(str))
            {
                System.out.println("acount existed");
            }
           else{  hs.add(str);
               System.out.println("registration complete");}
        }
    }
    boolean allChar(String str)
    {
        for(int i = 0;i<str.length();i++)
        {
           char c = str.charAt(i);
           boolean isc = c>='a'&&c<='z'||c>='A'&&c<='Z';
            if(!isc) return false;
        }
        return true;
    }
}
