package Leetcode57;

import java.util.ArrayList;
import java.util.List;

// 合并区间
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        // 新的区间左边界和右边界
        boolean placed = false;
        List<int[]> ansList = new ArrayList<int[]>();
        // 新的arrayList
        for (int[] interval : intervals) {
            if (interval[0] > right) {
                // 在插入区间的右侧且无交集
                if (!placed) {
                    ansList.add(new int[]{left, right});
                    // 如果待插入区间在某个区间的右边，先插入区间，然后把已知的区间插入
                    placed = true;
                }
                ansList.add(interval);
            } else if (interval[1] < left) {
                // 在插入区间的左侧且无交集
                ansList.add(interval);
            } else {
                // 与插入区间有交集，计算它们的并集
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
            // 相当于简化成三种情况，两种是没有交集的，一种是有交集的
        }
        if (!placed) {
            ansList.add(new int[]{left, right});
            // 如果是有交集的话就要看是不是和下一个区间也有关联
        }// 使用placed记录状态
        int[][] ans = new int[ansList.size()][2];
       //  返回一个二维数组
        for (int i = 0; i < ansList.size(); ++i) {
            ans[i] = ansList.get(i);
            // 可以按照维度赋值
        }
        return ans;
    }
}

