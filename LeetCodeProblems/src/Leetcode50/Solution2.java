package Leetcode50;
// 快速幂算法
// 20211116
// 此代码超时
public class Solution2 {

    public double myPow(double x, int n) {
     if(n == 0) return 1.0;


     if(n<=0)
     {
         x= 1/x;
         if(n == Integer.MIN_VALUE) {n = -(n+1);return myPow2(x,n)*x;}
         else {
         n = -n;}

     }

        return myPow2(x,n);

    }
    private double myPow2(double x,int n){
        while(n>1)
        {
            double t = myPow(x,n/2);
            if((n&1)==0)
            {
                n = n>>1;

                return t*t;
            }
            else
            {
                n = n>>1;
                return t*t*x;
            }
        }
        return x;
    }
}
