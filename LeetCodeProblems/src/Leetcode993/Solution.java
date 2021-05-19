package Leetcode993;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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

class Solution {
    HashMap<Integer,Integer> nodemap = new HashMap<>();
    HashMap<Integer,Integer> levelmap = new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;

        int level = 0;
        queue.add(root);
       // levelmap.put(root,level);
        while(!queue.isEmpty())
        {

           level++; // 进行下一层的层序遍历
             int size = queue.size();
            for(int i =0;i< size;i++)
            {
                TreeNode currentNode =queue.poll();
               if(currentNode.left!=null) {
                   queue.add(currentNode.left);
                   record(currentNode.left,currentNode,level,x,y);
               }
               if(currentNode.right!=null)
               {
                   queue.add(currentNode.right);
                   record(currentNode.right,currentNode,level,x,y);
               }
            }
            if(levelmap.containsKey(x)&&levelmap.containsKey(y)) break;
        }
        if(levelmap.get(x)==levelmap.get(y)&&nodemap.get(x)!=nodemap.get(y))
            return true;
        else return false;
    }
    private void record(TreeNode currentNode, TreeNode parentNode,int level,int x,int y)
    {
        // 判断结点是否出现
        if(currentNode.val == x||currentNode.val == y)
        {  levelmap.put(currentNode.val,level);
            nodemap.put(currentNode.val,parentNode.val);}
    }
}
