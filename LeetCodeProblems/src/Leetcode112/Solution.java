package Leetcode112;

import java.util.LinkedList;
import java.util.Queue;
// leetcode 112 路径总和
public class Solution {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            Queue<TreeNode> queNode = new LinkedList<TreeNode>();
            Queue<Integer> queVal = new LinkedList<Integer>();
            queNode.offer(root);
            queVal.offer(root.val);
            // 此处设置两个队列 放置节点和节点里面的值
            while (!queNode.isEmpty()) {
                TreeNode now = queNode.poll();
                int temp = queVal.poll();
                if (now.left == null && now.right == null) {
                    // 只要访问到最终的叶子结点，就判断一下是否存在满足条件
                    // 的结点
                    if (temp == sum) {
                        return true;
                    }
                    continue;
                }
                if (now.left != null) {
                    queNode.offer(now.left);
                    queVal.offer(now.left.val + temp);
                }
                if (now.right != null) {
                    queNode.offer(now.right);
                    queVal.offer(now.right.val + temp);
                }
            }
            return false;
        }
    }


