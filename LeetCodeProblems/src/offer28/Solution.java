package offer28;
// 是否对称
public class Solution {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  // 对称的二叉树
    /*
      对于树中任意对称节点L和R都有
      L.val = R.val
      L.left.val = R.right.val
      L.right.val = R.left.val
    */
    public boolean isSymmetric(TreeNode root) {
       if(root==null) return true;
         return judge(root.left,root.right);
    }
    public boolean judge(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null) return true;
        if(left==null||right==null||left.val!=right.val) return false;
        return judge(left.left,right.right)&&judge(left.right,right.left);
    }
}
