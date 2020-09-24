package Leetcode561;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int sum=0;
       for(int i =0;i< nums.length/2;i++)
       {
           sum += nums[2*i];
       }
       return sum;
    }
}