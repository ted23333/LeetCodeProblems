package Leetcode779;

public class Solution {
    public int kthGrammar(int N, int K) {
        return helper(N,K,0);
    }
    int helper(int N, int K, int flag){
        if(N==1) return flag;
        int half = (1<<N-2); //相当于求2的(n-1)次幂
        if(K<=half){
            return helper(N-1,K,flag);
            //小于前一半的话直接去前一行找
        }
        else {
            // 大于前一半的话就需要从前一行的翻转找
            return helper(N-1,K-half,1-flag);

        }
    }
}
