package Leetcode515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 二叉树每一行的最大值
public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }}
        public List<Integer> largestValues(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       List<Integer> values = new ArrayList<>();
       if(root!=null)
           queue.add(root);//入队
            while(!queue.isEmpty())
            {
                int max = Integer.MIN_VALUE;
                int levelSize = queue.size();
                for(int i = 0;i<levelSize;i++)
                {
                    TreeNode node = queue.poll();
                    max = Math.max(max, node.val);
                    if(node.left!=null)
                        queue.add(node.left);
                    if(node.right!=null)
                        queue.add(node.right);
                }
                values.add(max);
            }
            return values;
        }}

