package Leetcode135;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ret = 1;
        // 糖果总数
        int inc = 1, dec = 0, pre = 1;
        // 当前递减序列的长度dec，最近的递增序列的长度inc和前一个同学分到的糖果数量pre
        // 如果当前同学比上一个同学的评分高，说明就在最近的递增序列中，直接分配给该同学pre+1个糖果
        // 否则处于递减序列中，直接分配给当前一个同学一个糖果，并把该同学所在的递减序列中所有同学多分配一个糖果
        for (int i = 1; i < n; i++) {
            if (ratings[i] >= ratings[i - 1]) {
                dec = 0;
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                // 看是不是递增序列 不是的话赋值为1
                ret += pre;
                inc = pre;
            } else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                ret += dec;
                pre = 1;
            }
        }
        return ret;
    }
}
