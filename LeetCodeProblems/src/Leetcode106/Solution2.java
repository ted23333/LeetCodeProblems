package Leetcode106;


import java.util.HashMap;
// 模仿105做的题解
public class Solution2 {
    class TreeNode{
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    // 从中序与后序序列遍历二叉树
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return buildTreeHelper(inorder,0,inorder.length-1,postorder,0, postorder.length-1,map);    }
    private TreeNode buildTreeHelper(int []inorder,int i_start,int i_end,int []postorder,
                                     int p_start,int p_end,HashMap<Integer,Integer> map )
    {
        if (p_start > p_end) {
            return null;
        }
        int root_val = postorder[p_end];
        // 后序遍历的最后一个结点是根节点
        // 也是上一个结点的右子结点
        int i_root_index = map.get(root_val);
        int rightNum =i_end-i_root_index;
        // 右子树的节点数量
        TreeNode root = new TreeNode(root_val);
        root.right = buildTreeHelper(inorder,i_root_index+1,i_end,postorder,p_end-rightNum,p_end-1,map);
        root.left  = buildTreeHelper(inorder,i_start,i_root_index-1,postorder,p_start,p_end-rightNum-1,map);
        return root;
    }
}
