package Leetcode153;

class Solution {
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
        return nums[left];
    }
};

