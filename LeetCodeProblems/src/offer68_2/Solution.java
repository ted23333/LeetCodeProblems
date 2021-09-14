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
// 对二叉树进行先序遍历 当遇到节点p或者节点q的时候返回 从底到顶回溯，当节点p和q在root的两侧的时候，节点root即为最近公共祖先 向上返回root

    // 根据返回值可能会有四种不同的情况
   // 1 当left和right同时为空 说明都不包含p和q 返回null
    // 2  left和right同时不为空，说明在不同的侧 root是公共祖先
    // 3 left空 right不空 两个点都不在root的左子树中，直接返回right 具体可以分为两种情况
    // p q其中一个在root的右子树中，此时right指向某个节点 p或者q
    // 4 left不空 right空 同理
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


