package Leetcode41;

import java.util.HashSet;
import java.util.Set;

// 缺失的第一个正数
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        // 最小的元素应该在1~（N+1）之间
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=length+1;i++)
        {
            set.add(i);
        }
        for( int num:nums)
        {
            if(set.contains(num))
            {
                set.remove(num);
            }
        }
       int temp = length+2;
        for(int set_number:set)
        {
            if(set_number<temp)
                temp = set_number;
        }
        return temp;
    }
}
