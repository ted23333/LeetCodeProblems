package Leetcode508;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

//出现次数最多的子数元素和
public class Solution {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
      HashMap<Integer,Integer> result = new HashMap<>();
      private int maxcount = 1;
      int l = 0;
      public int[] findFrequentTreeSum(TreeNode root) {
       count(root);
       Set Keys  = result.keySet();
       List<Integer> list  = new ArrayList<>();
       for(Object k:Keys)
       {
           if(result.get(k)==maxcount) list.add((int)k);
       }
       int []ans = new int[list.size()];
       while(l<list.size())
           ans[l] = list.get(l++);
       return ans;
    }
    public int count(TreeNode root)
    {
        if(root==null) return 0;
        else {
            int num = root.val+count(root.left)+count(root.right);

            if(result.getOrDefault(num,0)+1 > maxcount)
                maxcount = result.getOrDefault(num,0) +1;
            result.put(num, result.getOrDefault(num,0)+1 );
        return num;
        }
    }
}
