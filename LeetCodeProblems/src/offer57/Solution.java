package offer57;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
      while(l<r)
      {
          if(nums[l]+nums[r]==target) return new int[]{nums[l],nums[r]};
          else if(nums[l]+nums[r]<target) l++;
          else r--;
      }
      return new int[2];
    }
}
