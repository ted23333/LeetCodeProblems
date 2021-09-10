package offer55_2;
// 平衡二叉树
public class Solution {
        public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
          // 用 left，right记录root左右子节点的深度，避免遍历的时候
        // 对左右节点的深度进行重复计算
        //  对于当前遍历到的节点，先递归判断左右子树是否平衡 再判断以当前节点为根的子树是否平衡，
        //  如果一棵树是平衡的，则返回其高度，否则返回-1 如果存在一棵子树不平衡 则整个二叉树不平衡
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
        // 如果满足二者之差小于2就返回高度，否则返回-1
    }

}
