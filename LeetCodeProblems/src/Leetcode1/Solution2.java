package Leetcode1;

import java.util.HashMap;
import java.util.Map;

// 20210920二刷
// 利用哈希表建立映射
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solutions");
    }
}
