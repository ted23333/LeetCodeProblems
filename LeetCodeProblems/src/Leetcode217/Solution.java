package Leetcode217;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> not_dep = new HashSet<Integer>();

        for(int i=0;i< nums.length;i++)
        {
            if(not_dep.contains(nums[i])) return true;
            else not_dep.add(nums[i]);
        }
        return false;
    }
}