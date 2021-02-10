package Leetcode199;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// 二叉树的右视图
public class Solution {
       class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
    Deque<TreeNode> queue = new LinkedList<>();
    TreeNode node = root;
    queue.offerLast(node);

    while(!queue.isEmpty())
    { int size = queue.size();
    //当前层的结点数量
     int currPoint=0;
     // 当前层的结点计数，应该返回当前层的最后一个节点
      for(int i =0;i<size;i++)
      {
          node =  queue.pollFirst();
          if(node.left!=null)
              queue.offerLast(node.left);
          if(node.right!=null)
              queue.offerLast(node.right);
          if(i==size-1) result.add(node.val);
      }
      //当前层输出结束
    }
    return result;
    }
}
