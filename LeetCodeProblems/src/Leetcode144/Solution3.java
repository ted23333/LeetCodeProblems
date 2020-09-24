package Leetcode144;

import java.util.ArrayList;
import java.util.List;
// 递归先序遍历二叉树
public class Solution3 {
    public class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return result;

    }
    void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        result.add(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }
}
