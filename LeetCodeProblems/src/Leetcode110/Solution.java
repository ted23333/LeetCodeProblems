package Leetcode110;
// 平衡二叉树
class Solution {
    class TreeNode{
        int val;
    TreeNode left;
    TreeNode right;
        TreeNode(int x)
        {
            val =x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
    // 思路是对二叉树做先序遍历，从底至顶返回子树的最大高度，
    //当前结点 root的左右子树高度差小于2时候，返回以结点root为根结点的子树的最大高度max(left,right)+1
    // 当结点root左右子树的高度差大于等于2，返回-1，代表该子树不是平衡树
}

