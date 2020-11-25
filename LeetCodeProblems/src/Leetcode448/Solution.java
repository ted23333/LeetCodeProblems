package Leetcode448;

import java.util.LinkedList;
import java.util.List;

// 找到所有数组中消失的数字
public class Solution {
    // 这道题可以用哈希表使用额外的O(n)空间来完成
    //如果原地修改的话
    // 遍历数组的每个元素一次
    // 把[num[i]-1]索引位置的元素标记为负数
    // 遍历数组，若当前数组元素为负数，说明在数组中存在数字i+1
    public List<Integer> findDisappearedNumbers(int[] nums){
        for(int i=0;i< nums.length;i++)
        {
            int newIndex =Math.abs(nums[i])-1;
            if(nums[newIndex]>0)
            {
                nums[newIndex]*= -1;
            }
        }
        List<Integer> result = new LinkedList<Integer>();
        for(int i=1;i<=nums.length;i++)
        {
            if(nums[i-1]>0){
                result.add(i);
            }
        }
        return result;
    }
}
