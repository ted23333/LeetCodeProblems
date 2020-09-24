package Leetcode160;
//求链表相交
public class Solution {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x;next = null;}

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     if(headA==null||headB==null) return null;
     ListNode pA =headA;
     ListNode pB = headB;
     while(pA!=pB)
     {
         pA = pA == null ? headB : pA.next;
         pB = pB == null ? headA : pB.next;
     }
     // 这段代码的意思是让每个结点跑两个链表长度的和，如果要是相遇的话就
        // 就代表存在交点，没有的话就不会相遇
     return pA;
    }
}
