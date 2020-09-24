package Leetcode144;

import java.util.LinkedList;
import java.util.List;
// 非递归先序遍历二叉树，分别将右子树左子树入栈的做法
public class Solution2 {
    public List<Integer> preorderTraversal(Solution.TreeNode root) {
        LinkedList<Solution.TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Solution.TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }
}
