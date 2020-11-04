package Leetcode590;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
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
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root==null){
            return output;
        }
        stack.add(root);
        // 按照根右左的顺序加进链表中，每次都加到链表的头
        while(!stack.isEmpty())
        {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for(Node item:node.children)
            {
                if(item!=null)
                    stack.add(item);
            }
        }
        return output;
    }

}
