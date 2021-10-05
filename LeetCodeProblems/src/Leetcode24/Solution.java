package Leetcode24;
// 两两交换链表中的节点
// 20211005
  class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode dummyhead = new ListNode(-1);
       dummyhead.next = head;
       ListNode curr = dummyhead;
       while(curr.next!=null&&curr.next.next!=null)
       {
           ListNode first = curr.next;
           ListNode second = curr.next.next;
           curr.next = second;
           first.next = second.next;
           second.next = first;
           curr = first;
       }
       return dummyhead.next;
    }
}
