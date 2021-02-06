package Leetcode113;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
// 深度优先遍历，枚举每一条从根节点到叶子节点的路径
public class Solution {
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
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        Deque<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     dfs(root,targetSum);
     return ret;
    }
    public void dfs(TreeNode root,int sum)
    {
        if(root == null)
            return;
        path.offerLast(root.val);
        // 双向队列的插入操作使用offerFirst/offerLast
        sum -=root.val;
        if(root.left==null&&root.right==null&&sum==0){
            // 如果满足条件
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left,sum);
        dfs(root.right,sum);
        path.pollLast();
    }
    }

