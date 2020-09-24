package Leetcode94;





import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public List< Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList< >();
        Stack <TreeNode> stack = new Stack< >();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            // 这个小循环是左插结点
            curr = stack.pop();
            res.add(curr.val);
            // 中序遍历是先弹出结点再记录该结点的值
            curr = curr.right;
        }
        return res;
    }
}

