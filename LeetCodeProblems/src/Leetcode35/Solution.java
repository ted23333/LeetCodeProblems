package Leetcode35;
// 搜索插入位置
class Solution {
    public int searchInsert(int[] nums, int target) {
       int length = nums.length;
       //索引是0~length-1
        int l =0,r=length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(nums[mid]<target)
                l=mid+1;
            else r= mid-1;
        }
        return l;
    }
}