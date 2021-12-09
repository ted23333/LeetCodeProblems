package Leetcode128;

import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        // 求最长子序列
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res = 0;
        for(int num:nums){
            // 遍历整个数组
            if(!map.containsKey(num)){
                // 如果当前哈希表不包含该数字
                int left = map.get(num-1)==null?0:map.get(num-1);
                int right = map.get(num+1)==null?0:map.get(num+1);
                // 检索数字的前一个数字和后一个数字
                int cur = 1+left+right;
                // 加起来
                if(cur>res){
                    res = cur;
                }
                // 记录最大值
                map.put(num,cur);
                map.put(num-left,cur);
                map.put(num+right,cur);
                // 应该是只记录边界就可以
            }
        }
        return res;
    }
}