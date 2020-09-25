package Leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 三个数之和
// 首先对数组进行排序。排序后固定一个数nums[i] 再使用左右指针指向nums[i]的后面的两端。
// 数字分别为nums[l]和nums[r],计算三个数的和数模判断是否满足为0，满足就加入结果集
//如果 nums[i]nums[i]大于 0，则三数之和必然无法等于 0，结束循环
//如果 nums[i]nums[i] == nums[i-1]nums[i−1]，则说明该数字重复，会导致结果重复，所以应该跳过
//当 sumsum == 0 时，nums[L] == nums[L+1] 则会导致结果重复，应该跳过，L++
// 当 sumsum == 0 时，nums[R] == nums[R−1] 则会导致结果重复，应该跳过 R−−

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            //这个循环决定怎么去找满足条件的元素组
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                    // 满足条件的话是可以同时加减的，否则不用
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}


