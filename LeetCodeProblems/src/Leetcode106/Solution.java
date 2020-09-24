package Leetcode106;

import java.util.HashMap;

// 112 根据中序和后序遍历二叉树
// 根据后序找到二叉树的根节点 后序遍历是按照左-右-根 的顺序进行遍历的
// 通过递归来实现二叉树的构造
class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    int post_idx;
    int[] postorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public TreeNode helper(int in_left, int in_right) {
        // if there is no elements to construct subtrees
        if (in_left > in_right)
            return null;
        // 如果右边界小于左边界，那么代表这个传入的树是空的
        // pick up post_idx element as a root
        int root_val = postorder[post_idx];
        TreeNode root = new TreeNode(root_val);
        // 找到根结点 然后构造一个新的树
        // root splits inorder list
        // into left and right subtrees
        int index = idx_map.get(root_val);

        // recursion
        post_idx--;
        // build right subtree
        root.right = helper(index + 1, in_right);
        //找到根节点右边的元素作为右子树
        // build left subtree
        //index左边的结点作为左子树
        root.left = helper(in_left, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        // 这里是两个全局数组存储中序遍历和后序遍历的结果
        // start from the last postorder element
        post_idx = postorder.length - 1;
        // 首先找到后序遍历的最后一个结点，这个结点是树的根
        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder)
            // 这样遍历可以避免频繁的开箱和拆箱
            idx_map.put(val, idx++);
        // 把中序遍历的结果挨个取出来存在哈希表里面
        return helper(0, inorder.length - 1);
        // 递归构造二叉树
    }
}

