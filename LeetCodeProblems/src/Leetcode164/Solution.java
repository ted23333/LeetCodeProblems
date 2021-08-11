package Leetcode164;

import java.util.Arrays;

// 最大间距
public class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int max = 0;
        for(int i = 0;i<length-1;i++)
        {
            max = Math.max(max,nums[i+1]-nums[i]);
        }
        return max;
    }
}
