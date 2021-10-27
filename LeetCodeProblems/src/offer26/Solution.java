package offer26;
// 相同的子结构
public class Solution {

     public class TreeNode {
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
// 树的子结构 查看B是不是A 的子结构
    // 需要完成两步 先序遍历A中的所有节点 查看当前节点为根节点的子树是否包含树B
             public boolean isSubStructure(TreeNode A, TreeNode B) {
                 return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
             }
             boolean recur(TreeNode A, TreeNode B) {
            // 函数功能查看是否能够匹配
                 if(B == null) return true;
                 // B为空代表 树B已经完成匹配 返回true
                 if(A == null || A.val != B.val) return false;
                 // 匹配失败
                 return recur(A.left, B.left) && recur(A.right, B.right);
                 // 仍然需要匹配
             }



}
