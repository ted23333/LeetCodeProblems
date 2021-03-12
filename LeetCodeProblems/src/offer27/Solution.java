package offer27;

import java.util.Stack;

// 二叉树的镜像
public class Solution {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode mirrorTree(TreeNode root) {
     if(root==null) return null;
          Stack<TreeNode> stack = new Stack<>();
          stack.add(root);
          while(!stack.isEmpty())
          {
              TreeNode node  = stack.pop();
              if(node.left!=null) stack.add(node.left);
              if(node.right!=null) stack.add(node.right);
              TreeNode tmp  =node.left;
              node.left = node.right;
              node.right = tmp;
          }
          return root;
          // 这里要暂存root的子节点，因为递归右子节点的时候，左子节点的值已经发生改变
    }
}
