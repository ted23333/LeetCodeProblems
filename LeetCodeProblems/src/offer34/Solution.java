package offer34;

import java.util.LinkedList;
import java.util.List;

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
      }
  }

// 二叉树中和为某一值的路径 回溯
public class Solution {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
     recur(root,sum);
     return res;
    }
    void recur(TreeNode root,int tar)
    {
        if(root==null) return ;
        path.add((root.val));
        tar -= root.val;
        if(tar==0&&root.left==null&&root.right==null)
            res.add(new LinkedList(path));
        // 这里需要复制整个列表，否则加入res中的是一个对象
        recur(root.left,tar);
        recur(root.right,tar);
        path.removeLast();
    }
}
