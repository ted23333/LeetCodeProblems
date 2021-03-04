package Leetcode145;

import java.util.*;

//后序遍历二叉树
class Solution3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        Set<TreeNode> seen = new HashSet<>();
        while (root != null || !s.isEmpty()) {
            if (root == null && seen.contains(s.peek())) {
                // 第二次访问到该节点了就记录
                ans.add(s.pop().val);
            } else if (root == null) {
                // 左子树为空，标识当前结点已经访问，访问右节点
                seen.add(s.peek());
                root = s.peek().right;
            } else {
                // 节点未访问过而且不为空的话就把结点加入栈中
                s.push(root);
                root = root.left;
            }
        }
        return ans;
    }
}

