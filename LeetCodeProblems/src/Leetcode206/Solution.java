package Leetcode206;
// 反转链表
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val =x;
        }
    }
    public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode curr = head;
      while(curr!=null){
          ListNode next = curr.next;
          //提前存储当前结点的下一个结点
          curr.next = prev;
          // 把指针反转
          curr= next;
          // 推进指针到下一个
      }
      return prev;
}
}