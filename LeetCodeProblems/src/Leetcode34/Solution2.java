package Leetcode34;

public class Solution2 {
    public int[] searchRange(int[] nums,int target)
    {
        int r = nums.length-1;
        if(r+1==0) return new int[]{-1,-1};
        int l = 0;
        int mid;
        while(l<=r)
        {
            mid = l +(r-l)/2;
            if(nums[mid]==target) return search(nums,mid);
            if(nums[mid]>target)
            {
                r = mid-1;
            }
            else l = mid+1;
        }
        return new int[]{-1,-1};
    }
    int []search(int []nums,int position)
    {
        int length = nums.length;

        int left = position;
        int right = position;
        while(left-1>=0&& nums[left-1] == nums[position])
        {
            left--;
        }
        while(right+1<=length-1&& nums[right+1] == nums[position])
        {
            right++;
        }
        return new int[]{left,right};
    }
}
