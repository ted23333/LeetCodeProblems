package Leetcode142;

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
    public ListNode detectCycle(ListNode head) {

        if(head==null||head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;  //相遇的话就代表有环
            }
            //两个结点一个从当前位置走，一个从表头位置走，一定在环入口的位置相遇



        }
        if(fast==null||fast.next==null)
        {
            return null;
            // 没有环的话就返回null
        }
        slow = head;
        while(fast!=slow)
        {
            slow = slow.next;
            fast  = fast.next;
        }
        return fast;
        // return null;
        // 加这句话会超时
    }
}