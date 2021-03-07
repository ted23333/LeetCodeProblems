package offer68_2;
// 二叉树的最近公共祖先
public class Solution {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  // 设节点root为节点p和q的某个公共祖先，若其左子节点root.left和右子节点root.right都不是p和q的共同祖先
   // 满足条件的有以下三种情况，则只可能是以下情况之一：
    // p 和q在root的子树中，且分别在左右子树之中
    // p =root，q在子树中
    // q = root, p在子树中

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) return root;
            // 根节点为空或者 根节点等于p或者q
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left == null && right == null) return null; // 1.
            // 左子树和右子树都没没有包含p和q，返回null
            if(left == null) return right; // 3.
            //p和q 都不在左子树中 返回右结点
            if(right == null) return left; // 4.
            // p和q 都不在右子树中，返回左节点
            return root; // 2. if(left != null and right != null)
            // p和q在root的两侧，root是公共最近祖先

        }
    }


