package Leetcode274;

import java.util.Arrays;

// H指数
// 如果遍历的时候找到了当前值cititions[i]>h 说明我们找到了一篇被引用了至少h+1次的论文 h++
public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = citations.length-1;
        int h_index = 0;

        while(i>=0&&citations[i]>h_index)
        {
            h_index++;
            i--;
        }
      return h_index;
    }
}
