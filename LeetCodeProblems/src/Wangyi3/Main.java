package Wangyi3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2) {System.out.println("1 2");
            return;}
        int nums[] = new int[n+1];
        Arrays.fill(nums,10000);

        nums[1] = 1;
        Deque<Integer> odd = new LinkedList<>();
        Deque<Integer> even = new LinkedList<>();
        for(int i = 2;i<=n;i++)
        {  if((i%2)==0) even.offerLast(i);
        else odd.offerLast(i);}
        for(int i = 2;i<=n;i++)
        {
             if(nums[i]!=10000) continue;
             else {
                 if(nums[i/2]%2==0) nums[i] = odd.pollFirst();
                 else nums[i] = even.pollFirst();
             }
        }
        System.out.print(nums[1]);
        for(int i = 2;i<=n;i++)
        {
            System.out.print(" "+nums[i]);
        }

}}
