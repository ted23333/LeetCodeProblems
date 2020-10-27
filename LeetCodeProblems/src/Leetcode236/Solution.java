package Leetcode236;
// 二叉树的最近祖先
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

     class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x){val = x;}
     }
        Map<Integer, TreeNode> parent = new HashMap<Integer, TreeNode>();
        Set<Integer> visited = new HashSet<Integer>();

        public void dfs(TreeNode root) {
            if (root.left != null) {
                parent.put(root.left.val, root);
                dfs(root.left);
            }
            if (root.right != null) {
                parent.put(root.right.val, root);
                dfs(root.right);
            }
        }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            dfs(root);
            // 遍历二叉树 用哈希表记录每个节点的父节点指针
            while (p != null) {
                visited.add(p.val);
                p = parent.get(p.val);
            }
            //从p节点不断向他的祖先移动，并用数据结构记录已经访问过的祖先节点
            while (q != null) {
                if (visited.contains(q.val)) {
                    return q;
                }
                q = parent.get(q.val);
            }
            // 从q节点开始不断往他的祖先移动，如果有祖先已经被访问过，意味着是共同最深的祖先

            return null;
        }
    }



