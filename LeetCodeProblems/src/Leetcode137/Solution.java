package Leetcode137;


import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> setOccur = new HashSet<>();
        long answer = 0L;
        for (int i = 0;i<nums.length;i++)
            if(setOccur.add(nums[i])) answer = answer+nums[i]+nums[i];
            else answer -= nums[i];
        return (int)(answer/2);
    }
}