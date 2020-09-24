package Leetcode141;// 给定一个链表，判断链表中是否有环。
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
      if(head ==null||head.next==null){
          return false;
      }
      //定义快慢指针
        ListNode slow =head;
      ListNode fast =head.next;
      while(fast!=null&&fast.next!=null)
        {
            if(slow ==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
      return false;
    }
}