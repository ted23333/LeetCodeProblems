package Leetcode78;

import java.util.ArrayList;
import java.util.List;

// 子集
class Solution {
    public static void main(String[] args) {
        System.out.println(1<<6);
    }
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            //
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                    // 每次把第i位加入到数组中
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }
}


