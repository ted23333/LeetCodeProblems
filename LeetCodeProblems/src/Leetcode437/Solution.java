package Leetcode437;

import java.util.HashMap;
import java.util.Map;

// 路径总和Ⅲ
// 双递归 外层的递归遍历每一个结点
// 内层的递归计算以每一个结点为根的路径的条数
// 回溯和递归
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
        public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }

            int res = 0;
            // 遍历每个节点，并且将每一个节点都过一遍 countPath()，将所有节点的有效路径加起来
            res += countPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);

            return res;
        }

        /*
            计算从某一个节点出发一共能有多少条路径
        */
        public int countPath(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }

            int count = 0;

            if (root.val == sum) {
                ++count;
            }

            int leftCount = countPath(root.left, sum - root.val);
            int rightCount = countPath(root.right, sum - root.val);
            count += leftCount + rightCount;

            return count;
        }
    }


