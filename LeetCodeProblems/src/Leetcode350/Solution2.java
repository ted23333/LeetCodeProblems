package Leetcode350;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        int count = 0;
        int []result = new int[nums1.length];
        int flag=0;
        for(Integer i:nums1){
        map1.put(i,map1.getOrDefault(i,0)+1);}
        for(Integer j:nums2)
        {
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        for(Integer key: map1.keySet()){
            if(map2.containsKey(key))
            { count =Math.min(map1.get(key),map2.get(key));
            for(int t=0;t<count;t++)
            result[flag++]=key;
            }
        }
        return Arrays.copyOf(result,flag);
    }
}
