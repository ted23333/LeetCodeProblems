package Leetcode135;
// 两次遍历 如果右边比左边大的话，就是右边+1 否则置换为1
class Solutions {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        // 从右向左遍历 如果左边比右边大的话，就是左边+1 否则置换为1
        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
            // 取两次遍历的较大值
        }
        return ret;
    }
}

