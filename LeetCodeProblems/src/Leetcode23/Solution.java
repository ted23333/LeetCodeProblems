package Leetcode23;

import java.util.PriorityQueue;

// 合并k个有序链表
// 使用优先队列完成
// 维护当前每个链表没有被合并元素的最前面一个，k个链表最多有k个满足这样条件的元素
// 每次在这些元素里面选取val属性最小的元素合并到答案中
public class Solution {
     class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     }
     class Status implements Comparable<Status>{
         int val;
         ListNode ptr;
         Status(int val,ListNode ptr){
             this.val = val;
             this.ptr = ptr;
         }
         public int compareTo(Status status2)
         {
             return this.val -status2.val;
         }
     }
     PriorityQueue<Status> queue = new PriorityQueue<Status>();
      public ListNode mergeKLists(ListNode[] lists) {
           for(ListNode node:lists)
           {
               if(node!=null){
                   queue.offer(new Status(node.val,node));
               }
           }
           ListNode head = new ListNode(0);
           ListNode tail = head;
           while(!queue.isEmpty()){
               Status f = queue.poll();
               tail.next = f.ptr;
               tail = tail.next;
               if(f.ptr.next!=null){
                   queue.offer(new Status(f.ptr.next.val,f.ptr.next));
               }
           }
           return head.next;
         }
}
