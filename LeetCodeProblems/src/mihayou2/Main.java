package mihayou2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        String [] strings = str.split("0");
        for (String st:strings)
        {
            if((st.length()%2)==1) sum +=1;

        }
        System.out.println(sum);
    }
}
