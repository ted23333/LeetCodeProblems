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
            // 首先向左遍历到叶子结点
            while(!stack.isEmpty())
            {
               TreeNode cur = stack.pollLast();
               leftAdd(cur.right);
               // 弹出一个结点之后，将该节点的右儿子加入栈，然后向左遍历到叶子节点
            }

            return output;
        }
        void leftAdd(TreeNode root){
            // 向左搜索遍历结点加入到栈里面
            if(root==null) return;
            stack.add(root);
            output.add(root.val);
            //入栈的时候记录结点的值
            while(root.left!=null)
            {
                root= root.left;
                output.add(root.val);
                stack.add(root);
            }
        }


}
