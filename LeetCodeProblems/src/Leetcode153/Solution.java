package Leetcode153;
// 寻找排序数组中的最小值
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                // 满足mid>right说明左半部分是有序的
                //这里一定是中间的元素大于右边的元素才能缩小范围
                left = mid + 1;
            } else {
                // 否则说明右半部分有序
                right = mid;
            }
        }
        return nums[left];
    }
};

