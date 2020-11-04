package Leetcode590;

import java.util.ArrayList;
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

    public List<Integer> postorder(Node root) {

        List<Integer>  res = new ArrayList<Integer>();
        helper(res,root);
        return res;
    }
    private void helper(List<Integer>res,Node root)
    {
        if(root==null) return;
            for(Node node:root.children)
            helper(res,node);
        res.add(root.val);

    }
}
