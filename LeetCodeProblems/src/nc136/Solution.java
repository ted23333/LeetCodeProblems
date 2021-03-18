package nc136;
// 根据二叉树的前序和中序序列建立二叉树，并求出二叉树的右视图
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
    public int[] solve (int[] xianxu, int[] zhongxu) {
      TreeNode treeroot = buildTree(xianxu,zhongxu);
      if(treeroot == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeroot);
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(queue!=null)
        {
            int size  = queue.size();
            for(int i = size;i>0;i--)
            {
                if(i==1) result.add(queue.peek().val);
                TreeNode  pop = queue.poll();
                if(pop.left!=null)
                    queue.offer(pop.left);
                if(pop.right!=null)
                    queue.offer(pop.right);
            }
        }
        int []r = new int[result.size()];
        int y = 0;
        for(int a:result)
        {
            r[y++] = a;
        }
        return r;
    }
    public TreeNode buildTree(int []preorder, int []inorder){
         HashMap<Integer,Integer> map  = new HashMap<>();
         for(int i=0;i<inorder.length;i++)
         {
             map.put(inorder[i],i );
         }
         return buildTreeHelper(preorder, 0,preorder.length,inorder,0,inorder.length,map);
    }
    private TreeNode buildTreeHelper(int[] preorder,int p_start,int p_end,int []inorder,int i_start,int i_end,HashMap<Integer,Integer> map){
         if(p_start == p_end) return null;
         int root_val = preorder[p_start];
         TreeNode root = new TreeNode(root_val);
         int i_root_index = map.get(root_val);
         int leftNum = i_root_index - i_start;
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index, map);
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end, map);
        return root;
    }
}
