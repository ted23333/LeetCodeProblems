package Leetcode111;
// 二叉树的最小深度
// 递归条件：
/*
当root的左右孩子都为空的时候，返回1
当root的左右孩子有一个为空的时候，返回不为空的孩子节点的最小深度
当左右孩子都不为空的时候，返回深度较小的深度值
 */
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
    public int minDepth(TreeNode root) {
    if (root == null) return 0;
    if(root.left==null&&root.right==null) return 1;
    else if(root.left!=null&&root.right==null) return minDepth(root.left)+1;
    else if(root.left==null&&root.right != null) return minDepth(root.right)+1;
    else return 1+ Math.min(minDepth(root.left),minDepth(root.right));
    }


}
