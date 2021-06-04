package Leetcode368;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 最大整除子集
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
         // 先排序
        // 第 1 步：动态规划找出最大子集的个数、最大子集中的最大整数
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxSize = 1;
        int maxVal = dp[0];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                // 题目中说「没有重复元素」很重要
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // 不断更新得到最大值
                }
            }

            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxVal = nums[i];
            }
            // 记录
        }

        // 第 2 步：倒推获得最大子集
        List<Integer> res = new ArrayList<Integer>();
        if (maxSize == 1) {
            res.add(nums[0]);
            return res;
        }
        // 如果没有满足条件的集合，就返回第一个元素

        for (int i = len - 1; i >= 0 && maxSize > 0; i--) {
            if (dp[i] == maxSize && maxVal % nums[i] == 0) {
                res.add(nums[i]);
                maxVal = nums[i];
                maxSize--;
            }
        }

        return res;
    }
}


