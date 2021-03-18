package offer39;
// 判断是否为平衡二叉树
public class Solution {
     class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    public boolean IsBalanced_Solution(TreeNode root)
    {
       return depth(root)!=-1;
    }
    public int depth(TreeNode root)
    {
        if(root == null) return 0;
        int left = depth(root.left);
        if(left==-1) return -1;
        int right = depth(root.right);
        if (right==-1) return -1;
        if(left - right <(-1)||left-right>1)
            return -1;
        // 如果左右子树的高低大于1，则返回-1
        else return 1+(left>right?left:right);
    }
}
