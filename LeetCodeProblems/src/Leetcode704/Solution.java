package Leetcode704;

public class Solution {
    public int search(int[] nums, int target) {
      int i = 0; int j = nums.length-1;
      if(target<nums[i]||target>nums[j]) return -1;
      return biSearch(nums,i,j,target);
    }
    private int biSearch(int[] nums,int i,int j,int target)
    {
        int mid = i+((j-i)>>1);
        while(i<=j)
        {
            if(target==nums[mid]) return mid;
            else if(target>nums[mid]) return biSearch(nums, mid+1, j, target);
            else return biSearch(nums, i, mid-1, target);
        }
        return -1;
    }
}
