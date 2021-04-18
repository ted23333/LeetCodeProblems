package Leetcode45;
// 跳跃游戏
// 贪心算法
class Solution {
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        // 代表可以跳到的最大位置
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            // 更新可以跳到的最大位置
            if (i == end) {
                end = maxPosition;
                // end 存储最终可以跳到的位置
                steps++;
            }
        }
        return steps;
    }
}


