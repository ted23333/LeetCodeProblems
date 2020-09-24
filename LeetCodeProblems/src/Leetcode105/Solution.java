package Leetcode105;

import java.util.HashMap;

// 根据前序和中序遍历构造二叉树
// 这个没有调试好
public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    int pre_idx;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
    public TreeNode helper(int in_left, int in_right)
    {
        if(in_left>in_right) return null;
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);
        int index = idx_map.get(root_val);
        pre_idx++;
        root.right = helper(index+1,in_right);
        root.left = helper(in_left,index-1);
        return root;
    }
    public TreeNode buildTree(int [] inorder, int [] preorder)
    {
        this.preorder = preorder;
        this.inorder = inorder;
        pre_idx = 0;
        // 先序遍历的第一个结点是根节点
        int idx =0;
        for(Integer val:inorder )
        {
            idx_map.put(val,idx++);

        }
        return helper(0,inorder.length-1);
    }
}
