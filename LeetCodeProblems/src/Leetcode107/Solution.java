package Leetcode107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 二叉树的层序遍历
public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new LinkedList<List<Integer>>();
      if(root==null)
      {
          return result;
      }
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.offer(root);
      while(!queue.isEmpty()){
          List<Integer> level  = new ArrayList<Integer>();
          int  size = queue.size();
          for(int i=0;i<size;i++)
          {
              TreeNode node = queue.poll();
              level.add(node.val);
              TreeNode left = node.left,right = node.right;
              if(left!=null){
                  queue.offer(left);
              }
              if(right!=null){
                  queue.offer(right);
              }
          }
          result.add(0,level);
      }
      return  result;
    }
}
