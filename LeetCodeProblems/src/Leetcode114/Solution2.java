package Leetcode114;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// 使用先序遍历先获取当前的顺序
public class Solution2 {
      class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }}
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node  = root;
        while(node!=null||!stack.isEmpty())
        {
            while(node!=null){
            list.add(node);
            stack.push(node);
            node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
       int size =list.size();
        for(int i= 1;i<size;i++)
        {
            TreeNode prev = list.get(i-1),curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }
}
