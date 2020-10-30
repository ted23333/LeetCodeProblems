package Leetcode701;

public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val =x;
        }
    }
    public TreeNode insertIntoBST(TreeNode root,int val){
        if(root == null)
            return new TreeNode(val);
        TreeNode cur = root;
        while(true)
        {
            if(cur.val>val)
            {
                if(cur.left!=null)
                {
                    cur =cur.left;
                }
                else {
                    cur.left = new TreeNode(val);
                    return root;
                }
            }
            else
            {
                if(cur.right!=null)
                {
                    cur =cur.right;
                }
                else {
                    cur.right = new TreeNode(val);
                    return root;
                }
            }
        }
    }
}
