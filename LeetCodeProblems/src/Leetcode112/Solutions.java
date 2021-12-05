package Leetcode112;

public class Solutions {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return dfs(root,targetSum);
    }
    boolean dfs(TreeNode root, int targetSum)
    {
        if(root==null) return false;
        targetSum -= root.val;
        if(targetSum==0&&(root.left==null&&root.right==null)) return true;
        else
        {

            return dfs(root.left,targetSum)||dfs(root.right,targetSum);
        }


    }
}
