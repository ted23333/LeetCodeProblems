package Leetcode83;
 // 删除链表中的重复元素
public class Solution {
      public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
     public ListNode deleteDuplicates(ListNode head) {
         ListNode current = head;
         while (current != null && current.next != null) {
             if (current.next.val == current.val) {
                 current.next = current.next.next;
             } else {
                 current = current.next;
             }
         }
         return head;
     }


}
