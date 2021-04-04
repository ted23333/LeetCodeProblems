package Leetcode113;

public class Test {


     static class TreeNode {
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
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = null;
        node3.left = node5;
        node3.right = node6;
        node4.left = node7;
        node4.right  = node8;
        node5.left = null;
        node5.right = null;
        node6.left = node9;
        node6.right = node10;
        node7.left = null;
        node7.right = null;
        node8.left = null;
        node8.right = null;
        node9.left = null;
        node9.right = null;
        node10.left = null;
        node10.right = null;
        // 初始化测试树
    }
}
