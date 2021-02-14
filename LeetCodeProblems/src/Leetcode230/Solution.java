package Leetcode230;

import java.util.LinkedList;

// 二叉树的第k个结点
// 利用二叉搜索树的中序遍历来实现
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
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while(true)
        {
            while(root!=null)
            {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if(--k==0) return root.val;
            root = root.right;
        }
    }

    }
}
