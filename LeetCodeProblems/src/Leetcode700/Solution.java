package Leetcode700;

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
    public TreeNode searchBST(TreeNode root,int val)
    {
        if(root ==null) return null;
        if(root.val==val) return root;
        else if(val>root.val) return searchBST(root.right,val);
        else return searchBST(root.left,val);
    }
}
