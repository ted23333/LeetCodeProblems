package Leetcode35;

public class Solution2 {
    public int searchInsert(int []nums,int target)
    {
        int r = nums.length-1;
        if(r+1==0) return 0;
        int l = 0;
        int mid;
        while(l<=r)
        {
            mid = l+(r-l)/2;
            if(nums[mid]<target)  l = mid+1;
            else r = mid-1;
        }
        return l;
    }
}
