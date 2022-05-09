package Leetcode42;
// 双指针解决 空间复杂度是O(1)
class Solutions {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        // 记录两个指针
        int leftMax = 0, rightMax = 0;
        // 记录两个最大值
        while (left < right) {
            // 如果两个指针不相遇的话，就不停移动
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            // 更新最大值
            if (height[left] < height[right]) {
                // 左小于右就更新左边的
                ans += leftMax - height[left];
                ++left;
            } else {
                // 左大于右就更新右边的
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }
}


