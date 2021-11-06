package Leetcode33;

public class Solution3 {
    public int search(int []nums,int target)
    {
        int n = nums.length;
        if(n == 0)
        {
            return  -1;
        }
        if(n == 1)
        {
            return nums[0]==target?0:-1;
        }
        int l = 0,r = n-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){
                // 判断中位数在左边还是右边的区间 如果满足，说明左边半个区间有序
                if(nums[l]<=target&&target<nums[mid])
                {
                    r = mid -1;
                }
                else l = mid+1;
            }
            else
            {
                if(nums[mid]<target&&target<=nums[r])
                    l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }
}
