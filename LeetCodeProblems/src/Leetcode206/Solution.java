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
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode end = head;
        ListNode temp;
        while(end.next!=null)
        {
            end = end.next;
            //让end移动到最后一个节点
        }
        while(dummyHead.next!=end)
        {
            temp = dummyHead.next;
            dummyHead.next=temp.next;
           temp.next = end.next;
           end.next = temp;
            //最后一个结点的下一个结点是虚拟头结点的下一个结点

        }
        return dummyHead.next;
    }
}