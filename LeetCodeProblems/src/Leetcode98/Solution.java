package Leetcode98;



public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val = x;
        }
    }

        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }
        // 这里对二叉树结点的大小是有要求的
        public boolean helper(TreeNode node, Integer lower, Integer upper) {
            if (node == null) {
                return true;
            }

            int val = node.val;
            if (lower != null && val <= lower) {
                return false;
            }
            if (upper != null && val >= upper) {
                return false;
            }
             // 不满足BST性质的直接false

            if (!helper(node.right, val, upper)) {
                return false;
            } // 左遍历
            if (!helper(node.left, lower, val)) {
                return false;
            } // 右遍历
            return true;
        }


}
