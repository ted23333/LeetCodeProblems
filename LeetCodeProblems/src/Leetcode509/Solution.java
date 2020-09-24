package Leetcode509;

public class Solution {
    public int fib(int N){
        if(N<=1) return N;
        return memorize(N);
    }
    public int memorize(int N){
        int []cache  = new int[N+1];
        cache[1] =1;
        // 这里要建立的大一点，因为存储是从1开始存的
        for(int i=2;i<=N;i++)
        {
            cache[i] = cache[i-1]+cache[i-2];
        }
        return cache[N];
    }
}
