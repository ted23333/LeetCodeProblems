package offer55_1;



import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    int depth=0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }}
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size()!=0)
        {
            depth++;
            int length = queue.size();
            for(int i = 0;i< length;i++)
            {
                TreeNode temp = queue.poll();
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
        }
        return depth;
    }

    }

