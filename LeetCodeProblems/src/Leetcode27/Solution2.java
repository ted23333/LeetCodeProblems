package Leetcode27;

public class Solution2 {
    public int removeElement(int[] nums, int val) {
     int length = nums.length;
     if(length==0) return 0;
     if(length==1&&nums[0]==val) return 0;
     int i = 0;
     int j = length-1;
     int temp;
     int time = 0;
     while(i<=j)
     {
         if(nums[i]==val){
             temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
             j--;
             time++;
         }
         else i++;
     }
     return length-time;
    }
}
