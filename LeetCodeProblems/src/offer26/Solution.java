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

             public boolean isSubStructure(TreeNode A, TreeNode B) {
                 return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
             }
             boolean recur(TreeNode A, TreeNode B) {
                 if(B == null) return true;
                 if(A == null || A.val != B.val) return false;
                 return recur(A.left, B.left) && recur(A.right, B.right);
             }



}
