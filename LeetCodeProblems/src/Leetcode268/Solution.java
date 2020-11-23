package Leetcode268;
import java.util.HashSet;
import java.util.Set;
// leetcode268 丢失的数字
class Solution {
    public int missingNumber(int[] nums) {
        int n_range  = nums.length;
        Set<Integer> set = new HashSet<>();
        for(Integer integer:nums)
            set.add(integer);
        for(int i=0;i<=n_range;i++)
        {
            if(!set.contains(i))
                return i;
        }
        return -1;
    }
}