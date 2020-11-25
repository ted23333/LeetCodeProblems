package Leetcode566;

import java.util.LinkedList;
import java.util.Queue;

// leetcode 566 重塑矩阵
// 可以用队列的方法求解，也可以用求模取余的方式来求解
public class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int[][] res = new int[r][c];
            if (nums.length == 0 || r * c != nums.length * nums[0].length)
                return nums;
            int count = 0;
            Queue< Integer > queue = new LinkedList< >();
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    queue.add(nums[i][j]);
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = queue.remove();
                }
            }
            return res;
        }
    }


