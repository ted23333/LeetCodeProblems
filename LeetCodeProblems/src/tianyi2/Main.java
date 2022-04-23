package tianyi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String []s = sc.nextLine().split(",");
        int []nums = new int[num];
        for(int i = 0;i<num;i++)
            nums[i] = Integer.parseInt(s[i]);
        boolean flag = true;
        for(int i = 0;i<num;i++)
        {
          if(nums[i]%2==0)
          {
              if(flag)
              {
                  System.out.print(nums[i]);
                  flag = false;
              }
              else
              {
                  System.out.print(",");
                  System.out.print(nums[i]);
              }
              }
        }
        for(int i = 0;i<num;i++)
        {
            if(nums[i]%2==1)
            {
                System.out.print(",");
                System.out.print(nums[i]);
            }
        }
    }

}
