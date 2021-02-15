package Leetcode257;



import java.util.ArrayList;
import java.util.List;

// 二叉树的所有路径
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
      }}
    public List<String> binaryTreePaths(TreeNode root) {
       // 深度优先搜索
        // 如果当前节点不是叶子节点，则在当前路径的末尾添加该结点，并继续递归遍历该节点的每一个孩子结点
        // 如果当前结点是叶子节点，则在当前路径末尾添加该节点后得到一条从根节点到叶子节点的路径，将该路径加入到答案
        List<String> paths = new ArrayList<String>();
        constructPaths(root,"",paths);
        return paths;
    }
    public void constructPaths(TreeNode root,String path,List<String> paths){
      if(root!=null)
      {
          StringBuffer pathSB = new StringBuffer(path);
          pathSB.append(Integer.toString(root.val));
          if(root.left==null&&root.right==null)
          {
              paths.add(pathSB.toString());
          }
          else{
              pathSB.append("->");// 当前节点不是叶子节点，继续递归遍历
              constructPaths(root.left,pathSB.toString(),paths);
              constructPaths(root.right,pathSB.toString(),paths);
          }
      }
      }
    }
