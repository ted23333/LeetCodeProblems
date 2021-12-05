package Leetcode113;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
// 20211205
public class Solutions {
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
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       dfs(root,targetSum);
       return ret;
    }
    void dfs(TreeNode root,int targetSum)
    {
      if(root == null) return;
      path.offerLast(root.val);
      targetSum -= root.val;
      if(root.left==null&&root.right==null&&targetSum==0)
      {
          ret.add(new LinkedList<Integer>(path));
      }
      dfs(root.left,targetSum);
      dfs(root.right,targetSum);
      path.pollLast();
    }
}
