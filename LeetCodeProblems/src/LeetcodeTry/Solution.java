package LeetcodeTry;
import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums,int target){
        Arrays.sort(nums);
        int i=0; int j = nums.length-1;
        while(i<j)
        {
            if(target-nums[i]>nums[j])
            i++;
            else if (target-nums[i]<nums[j])
                j--;
            else break;
        }
        return new int[]{i,j};
    }
}
