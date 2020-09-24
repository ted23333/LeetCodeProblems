package Leetcode498;
import java.util.ArrayList;
import java.util.Collections;
//对角线遍历
class Solution {
public int[] findDiagonalOrder(int[][] matrix) {

        // 特判，检查空矩阵
        if (matrix == null || matrix.length == 0) {
        return new int[0];
        }

        // 矩阵的大小：M 行 N 列
        int M = matrix.length;
        int N = matrix[0].length;

        int[] res = new int[M * N]; // 声明长度为 m * n 用于存储结果的一维数组
        int sign = 0; // 标记对角线的条数，用于翻转奇数对角线上的元素顺序
        int count = 0; // res数组的动态索引，遍历一条对角线就存储于res数组中

        for (int i = 0; i < (M + N - 1); i++) {
        sign++;
        // 根据行列切换的条件i < N，对x，y赋不同值
        int x = i < N ? 0 : (i + 1 - N);
        int y = i < N ? i : N - 1;
        int fromIndex = count; // 用于翻转res中新添加的奇数对角线元素的起始索引
        while (x < M & y >= 0) {
        res[count] = matrix[x][y];
        x++;
        y--;
        count++;
        }
        if (sign % 2 == 1) { // 奇数时翻转
        reverse(res, fromIndex, count);
        }
        }
        return res;
        }

public void reverse(int[] arr, int fromIndex, int toIndex) {
        /**
         * arr: 需要翻转的数组
         * fromIndex: 指定开始翻转的数组的索引位置
         * toIndex:翻转范围的最后索引位置（注意不包括索引为toIndex的元素）
         */
        for (int i = 0; i < ((toIndex - fromIndex) >> 1); i++) {
        int temp = arr[fromIndex + i];
        arr[fromIndex + i] = arr[toIndex - 1 - i];
        arr[toIndex - 1 - i] = temp;
        }
        }
        }

