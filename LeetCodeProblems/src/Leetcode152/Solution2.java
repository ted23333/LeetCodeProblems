package Leetcode152;

class Solution2 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            // imax代表当前结尾的最大值
            imin = Math.min(imin*nums[i], nums[i]);
            // imin 代表当前结尾的最小值
            max = Math.max(max, imax);
        }
        return max;
    }
}

