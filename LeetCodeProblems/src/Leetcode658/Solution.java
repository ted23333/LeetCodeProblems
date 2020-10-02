package Leetcode658;

import java.util.LinkedList;
import java.util.List;

// 寻找k个最接近的元素
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // 这道题可以转化为求k个元素数组的左边界
        int l = 0, r = arr.length - k;
        // 左边界可以是0，右边界最大的值是数组的长度-k
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                // 每次数组移动的时候，只需要比较mid和mid+k两个位置的元素（一左一右）
                // 根据这两个位置的元素判断 左边的元素是不是更接近x
                // 右边界没法判断是不是最优的，所以r = mid
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        //以l作为起始索引，长度为k
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            res.add(arr[i + l]);
        }
        return res;

    }
}


