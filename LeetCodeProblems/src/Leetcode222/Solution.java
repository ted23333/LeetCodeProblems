package Leetcode222;
// 完全二叉树的节点
// 完全二叉树是一棵空树或者它的叶子结点
// 对root节点的左右子树进行高度统计分别记为left和right，有以下两种结果
// left == right 这说明左子树一定是满二叉树,左子树的结点总数是2^left-1,加上root结点是2^left，再对右子树进行递归统计
// left!=right，说明此时最后一层不满，但是倒数第二层已经满了，可以直接得到右子树的结点个数，同理，右子树结点+root节点，
// 总数为2^right,再对左子树进行递归查找
class Solution {
         class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int countNodes(TreeNode root) {
             // 计算层的结点数量
        if(root == null){
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if(left == right){
            // 左的层数等于右边的层数说明左边一定是满二叉树
            return countNodes(root.right) + (1<<left);
            // 使用移位操作计算幂次
        }else{
            return countNodes(root.left) + (1<<right);
            // 不等于的话说明右边一定是满二叉树
        }
    }
    private int countLevel(TreeNode root){
             // 计算二叉树的层数
        int level = 0;
        while(root != null){
            level++;
            root = root.left;
        }
        return level;
        // 因为是完全二叉树，所以左子树的最大深度就是层数
    }
}

