package Leetcode144;

import java.util.LinkedList;
import java.util.List;
// 按照模板进行非递归先序遍历二叉树
public class Solution {
    /* Definition for a binary tree node. */
   class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            leftAdd(root);
            while(!stack.isEmpty())
            {
               TreeNode cur = stack.pollLast();
               leftAdd(cur.right);
            }

            return output;
        }
        void leftAdd(TreeNode root){
            if(root==null) return;
            stack.add(root);
            output.add(root.val);
            while(root.left!=null)
            {
                root= root.left;
                output.add(root.val);
                stack.add(root);
            }
        }


}
