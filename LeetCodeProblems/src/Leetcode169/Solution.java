package Leetcode169;

import java.util.HashMap;
import java.util.Map;

// 找出多数元素，使用哈希表来存储
public class Solution {

    private Map<Integer,Integer> countNums(int[] nums)
    {
        Map<Integer,Integer> counts = new HashMap<Integer, Integer>();
        for(int num:nums){
            if(!counts.containsKey(num))
            {
                counts.put(num,1);
            }
            else {
                counts.put(num,counts.get(num)+1);
            }
        }
        return counts;
    }
   public int majorityElement(int[] nums)
   {
       Map<Integer,Integer> counts = countNums(nums);
       Map.Entry<Integer,Integer> majorityEntry = null;
       for (Map.Entry<Integer,Integer> entry : counts.entrySet()){
           if(majorityEntry==null||entry.getValue()>majorityEntry.getValue()){
               majorityEntry = entry;}
   }
       return majorityEntry.getKey();
   }

}
