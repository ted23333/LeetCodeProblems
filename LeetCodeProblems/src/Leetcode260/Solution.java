package Leetcode260;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// 只出现一次的数字Ⅲ
public class Solution {
    public int[] singleNumber(int[] nums) {
      HashSet<Integer> set = new HashSet();
      for(int i =0;i<nums.length;i++)
      {
          if(!set.add(nums[i]))
              set.remove(nums[i]);
      }
      int []re = new int[2];
      int i = 0;
       for(Integer it:set)
      re[i++] = it;
       return re;
    }
}
