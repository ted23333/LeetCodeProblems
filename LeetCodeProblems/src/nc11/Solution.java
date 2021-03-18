package nc11;
// 将升序数组转化为BST
import java.util.*;



public class Solution {

     class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val =x;
        }
    }
    public TreeNode sortedArrayToBST (int[] num) {
        // write code here
        if(num == null){
            return null;
        }
        return helper(num, 0, num.length - 1);
    }

    private TreeNode helper(int[] num, int left, int right){
        if(left > right){
            return null;
        }
        int mid = left + (right - left + 1) / 2;
        TreeNode lNode = helper(num, left, mid - 1);
        TreeNode rNode = helper(num, mid + 1, right);
        TreeNode node = new TreeNode(num[mid]);
        if(lNode != null) node.left  = lNode;
        if(rNode != null) node.right = rNode;
        return node;
        // 递归生成二叉树
    }
}
