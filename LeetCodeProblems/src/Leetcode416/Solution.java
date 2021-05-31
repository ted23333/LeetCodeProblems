package Leetcode416;
// 分隔等和子集
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        // 如果子集长度小于2 就直接返回false
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        } // 如果总和是奇数，也直接返回false
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }  // 如果数组中存在大于一半和的数，也不行返回false
        boolean[][] dp = new boolean[n][target + 1];
        // 创建二维数组 包含n行 target+1列 其中dp[i][j]表示从数组的[0,i]下标中选取若干个正整数
        // 是否存在一种选取方案使得被选取的正整数的和等于j，初始时候dp中的所有元素都是false
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        // 如果不选任何正整数，则被选取的正整数等于0，对于所有的0<=i<n 都有dp[i][0]= true;
        dp[0][nums[0]] = true;
        // 这个必然满足
        // 对于i>0且j>0的情况
        // 如果j>= nums[i] 则对于当前的数字nums[i] 可以选取也可以不选
        // 两种情况只要有一个为true,就有dp[i][j]等于true
        // 1 如果不选nums[i]，则dp[i][j]= dp[i-1][j]
        // 2 如果选取nums[i],则dp[i][j] = dp[i-1][j-nums[i]]
        // 如果j<nums[i] 则在数字选取的和等于j的情况下无法选取当前的数字nums[i]
        // 因此有dp[i][j] = dp[i-1][j]
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    // 还可以加
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    // 加不了
                    dp[i][j] = dp[i - 1][j];

                }
            }
        }
        return dp[n - 1][target];
    }
}

