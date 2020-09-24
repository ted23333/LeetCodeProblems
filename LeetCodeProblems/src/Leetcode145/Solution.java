package Leetcode145;

import java.util.*;
// 后序遍历二叉树

public class Solution {
    public class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    //后序遍历 不使用逆序的形式
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        // 集合存储结点
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null && !set.contains(cur)) {
                stack.push(cur);
                cur = cur.left;
            } // 这个小循环遍历左子树
            cur = stack.peek();
            //右子树为空或者第二次来到这里 第二次来到这里代表右子树已经被访问过了
            if (cur.right == null || set.contains(cur)) {

                list.add(cur.val);
                set.add(cur);
                stack.pop();
                //将当前节点弹出 如果弹出之后栈空了就返回
                if (stack.isEmpty()) {
                    return list;
                }
                //转到右子树，这种情况对应于右子树为空的情况
                cur = stack.peek();
                cur = cur.right;
                //从左子树过来，加到 set 中，转到右子树
            }
            else {
                set.add(cur);
                cur = cur.right;
            }
        }
        return list;
    }


}
