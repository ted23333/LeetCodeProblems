package Leetcode33;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        int minindex  = findMin(nums);
     if(minindex==0) return bisearch(nums, target);   //考虑所给序列是正序列的情况
        if(target>=nums[0])
         return bisearch(Arrays.copyOfRange(nums,0,minindex),target);
     else
         return bisearch(Arrays.copyOfRange(nums,minindex,nums.length),target)==-1?-1:bisearch(Arrays.copyOfRange(nums,minindex,nums.length),target)+minindex;
    }

    public int bisearch(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = 0;
        while (lo <= hi) {
            mid = lo + ((hi - lo) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                //这里一定是中间的元素大于右边的元素才能缩小范围
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }


}
