package Leetcode124;
// 二叉树中的最大路径和
public class Solution {
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
        int max = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root)
        {
           if(root ==null)
               return 0;
           dfs(root);
           return max;
        }
        /*
        返回经过root的单边分支最大和
        即 Math.max(root,root+left,root+right)
         */
    public int dfs(TreeNode root)
    {
        if(root ==null)
        {
            return 0;
        }
        //计算左边分支最大值，左边分支如果为负数还不如不选择
        int leftMax = Math.max(0,dfs(root.left));
        //右边同理
        int rightMax = Math.max(0,dfs(root.right));
        max = Math.max(max,root.val+leftMax+rightMax);
        // 全局变量max记录最大路径和
        //返回经过root的单边最大分支给当前root的父节点计算使用
        return root.val+Math.max(leftMax,rightMax);
    }
}
