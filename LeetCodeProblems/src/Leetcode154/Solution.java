package Leetcode154;
// 寻找旋转排序数组中的最小值Ⅱ
public class Solution {
    // 本题就是要寻找将数组拆分为两个排序数组的中点i
    /*
    当nums[left]>nums[right]时，mid一定在第一个排序数组中，i一定满足mid<i<=right
    因此执行left = mid+1
    当nums[mid]<nums[right]时，mid一定在第二个排序数组中，i一定满足left<i<=mid，因此执行right=mid
    注意这里最小值也满足mid<right
    当nums[mid]==nums[right]时，因为数组中的元素是可以重复的，所以这个时候无法判断分界点i的区间
    这个时候采用right=right-1的方式解决这个问题
    （这个操作不会使得数组越界，因为迭代条件满足了right>left>=0
    而且不会造成最小值的丢失，)
     */
    public int findMin(int[] nums ){
        int left =0,right = nums.length-1;
        while(left<right)
        {
            int mid =(left+right)/2;
            if(nums[mid]>nums[right])left=mid+1;
            else if(nums[mid]<nums[right]) right = mid;
            else right = right-1;
        }return nums[left];
    }
}
