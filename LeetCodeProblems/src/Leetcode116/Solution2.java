package Leetcode116;
// 填充每个节点的下一个右侧节点指针

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    class Node{
        public  int val;
        public Node left;
        public Node right;
        public Node next;
        public Node(){}
        public Node(int _val){
            val = _val;
        }
        public Node(int _val,Node _left,Node _right,Node _next){
            val = _val;
            left = _left;
            right = _right;
            next = _right;
        }

    }
    public Node connect(Node root)
    {
       if(root==null)
           return root;
       Node cur = root;
       while(cur!=null)
       {
           Node dummy  = new Node(0);
           Node pre = dummy;
           // 添加一个哑节点作为该层节点链表的第一个节点
           // pre是指针
           while(cur!=null)
           {
               if(cur.left!=null)
               { pre.next = cur.left;
                 pre = pre.next;
               }
               if(cur.right!=null)
               {
                   pre.next = cur.right;
                   pre= pre.next;
               }

           }
           cur = dummy.next;
       }
       return root;
    }
}

