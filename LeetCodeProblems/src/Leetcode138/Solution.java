package Leetcode138;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    // 对于当前结点 首先进行拷贝 然后进行当前节点
    // 的后继结点和当前结点的随机指针指向的节点拷贝
    // 不断回溯来实现该算法
    Map<Node, Node> cachedNode = new HashMap<Node, Node>();
    public Node copyRandomList(Node head)
    {
        if(head==null) return null;
        if(!cachedNode.containsKey(head))
        {
            Node headNew = new Node(head.val);
            cachedNode.put(head,headNew);
            head.next = copyRandomList(head.next);
            head.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
