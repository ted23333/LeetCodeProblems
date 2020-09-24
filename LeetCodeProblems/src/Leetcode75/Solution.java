package Leetcode75;

import Leetcode144.Solution3;

import java.util.ArrayList;
import java.util.List;

// 颜色分类
public class Solution {
 public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
   val = x;
  }
 }
 List<Integer> result = new ArrayList<>();
 public List<Integer> inorderTraversal(TreeNode root) {
  inOrder(root);
  return result;

 }
 void inOrder(TreeNode root){
  if(root==null){
   return;
  }

  inOrder(root.left);
  result.add(root.val);
  inOrder(root.right);

 }
}
