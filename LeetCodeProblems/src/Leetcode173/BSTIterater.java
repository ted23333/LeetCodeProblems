package Leetcode173;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
// 手动实现一个栈中序遍历
// 初始时候，需要将当前节点的左节点依次入栈
// 对于hasNext() 方法，只需要判断栈是否为空
// 对于next()方法，栈顶元素即为下一个最小的元素，将栈顶元素出栈并返回其val即可
// 如果栈顶元素的结点 有右子树，则需要将其右子节点再进行中序遍历，进而完成对树整体的中序遍历。
class BSTIterator {
     class TreeNode{
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) {
             val =x;
         }
     }
    ArrayList<Integer> nodesSorted;
    int index;

    public BSTIterator(TreeNode root) {

        // Array containing all the nodes in the sorted order
        this.nodesSorted = new ArrayList<Integer>();

        // Pointer to the next smallest element in the BST
        this.index = -1;

        // Call to flatten the input binary search tree
        this._inorder(root);
    }

    private void _inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        this._inorder(root.left);
        // 递归调用自己
        this.nodesSorted.add(root.val);
        this._inorder(root.right);
        // 使用这种方式可以递归实现中序遍历
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return this.nodesSorted.get(++this.index);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.index + 1 < this.nodesSorted.size();
    }
}
