package LeetcodeTry;
import java.lang.reflect.Array;
import java.util.*;

class Solution {
public int fourSumCount(int[] A,int[] B,int[] C, int[] D){
    Map<Integer,Integer> map  = new HashMap<>();
    int res= 0;
    for(int i=0;i<A.length;i++)
        for(int j=0;j<B.length;j++)
        {
            int sumAB = A[i]+B[j];
            if(map.containsKey(sumAB)) map.put(sumAB,map.get(sumAB)+1);
            else map.put(sumAB,1);
            // 计算两个相加之和是多少 ，可以出现重复计算的情况
            // 只需要设置键值对就可以
        }
    for(int i=0;i<C.length;i++)
        for(int j=0;j<D.length;j++)
        {
            int sumCD = -(C[i]+D[j]);
            if(map.containsKey(sumCD)) res += map.get(sumCD);
        }
    return res;
}

}
