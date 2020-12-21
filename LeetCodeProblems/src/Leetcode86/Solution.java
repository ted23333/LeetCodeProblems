package Leetcode86;
// 分隔链表
public class Solution {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode Node1 = new ListNode(4);
        ListNode Node2 = new ListNode(3);
        ListNode Node3 = new ListNode(2);
        ListNode Node4 = new ListNode(5);
        ListNode Node5 = new ListNode(2);
        head.next = Node1;
        Node1.next =Node2;
        Node2.next = Node3;
        Node3.next = Node4;
        Node4.next = Node5;
        ListNode result  = new Solution().partition(head,3);

    }
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode dummyHead =new ListNode(-1);
     ListNode joint = new ListNode(x);
     ListNode curr = head;
     ListNode joint_record = joint;
     ListNode dummyHead_record = dummyHead;
     while(curr!=null){
         if(curr.val>=x)
         {
             joint_record.next = curr;
             joint_record = joint_record.next;
         }
         else {
             dummyHead_record.next = curr;
             dummyHead_record = dummyHead_record.next;
         }
         curr = curr.next;
     }
     joint_record.next =null;
      dummyHead_record.next = joint.next;
     return dummyHead.next;
    }
}
