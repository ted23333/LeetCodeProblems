package Leetcode33;
// 搜索旋转排序数组
// 思路 如何利用二分查找分区间
// 对于一个排序数组来说可以分为两类
// 比如 1 2 3 4 5 6 7
// 第一种 2 3 4 5 6 7 1 也就是说nums[start]<=nums[mid]
// 这种情况下，前半部分有序 因此如果nums[start]<=target<nums[mid]
// 就在前半部分找，否则在后半部分找
// 第二种 6 7 1 2 3 4 5 也就是nums[start] >nums[mid]
// 这种情况下后半部分有序 如果nums[mid]<target<=nums[end],则在后半部分找
// 否则去前半部分找
public class Solution2{
public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
        return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
        mid = start + (end - start) / 2;
        if (nums[mid] == target) {
        return mid;
        }
        //前半部分有序,注意此处用小于等于 为了最后两个数的时候能够匹配
        if (nums[start] <= nums[mid]) {
        //target在前半部分
        if (target >= nums[start] && target < nums[mid])
        // if满足此时说明target在左半部分，否则在右半部分
        {
        end = mid - 1;
        } else {
        start = mid + 1;
        }
        }
        else {
            // 后半部分有序
        if (target <= nums[end] && target > nums[mid]) {
        start = mid + 1;
        } else
            {
        end = mid - 1;
        }
        }

        }
        // 其实这里相当于每次都缩小要查找的区间
        return -1;

        }}
