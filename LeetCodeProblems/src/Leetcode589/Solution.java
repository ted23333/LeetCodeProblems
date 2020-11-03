package Leetcode589;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
       private List<Integer> res;
        public List<Integer> preorder(Node root) {
          res = new LinkedList<>();
          dfs(root);
          return  res;
        }
        private void dfs(Node root)
        {
            if(root ==null) return;
            res.add(root.val);
            for(Node child:root.children)
                dfs(child);
        }

}
