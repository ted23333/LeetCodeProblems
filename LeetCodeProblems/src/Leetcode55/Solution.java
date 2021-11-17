package Leetcode55;
// 跳跃游戏
  public class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int rightmost = 0;
            for (int i = 0; i < n; ++i) {
                if (i <= rightmost) {
                    // rightmost是能够到达的最大位置,这样就可以避免出现32104这种用例的情况
                    rightmost = Math.max(rightmost, i + nums[i]);
                    // 如果遍历到的位置能够到达的最大位置大于当前的最大位置，则更新最大的位置
                    if (rightmost >= n - 1) {
                        return true;
                        // 如果能够遍历数组的最后一个位置，那么就直接返回true
                    }
                }
            }
            return false;
        }
    }



