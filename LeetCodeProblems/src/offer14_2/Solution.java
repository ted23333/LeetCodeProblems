package offer14_2;

public class Solution {
    public int cuttingRope(int n){
        {
            if(n<3) return 1;
            if(n==3) return 2;
            long res = 1;
            while(n>4){
                res *=3;
                res %=1000000007;
                n -=3;
            }
            return (int)(n*res%1000000007);
        }
    }
}
