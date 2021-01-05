package offer24;

public class Solution {
    public class ListNode {
        int val;
       ListNode next;
        ListNode(int x) { val = x; }}
    public ListNode reverseList(ListNode head) {
      if(head==null||head.next==null) return head;
       ListNode pre = null;
       ListNode curr = head;
       ListNode temp;
       while(curr!=null)
       {
           temp = curr.next;
           curr.next = pre;
           pre = curr;
           curr = temp;

       }
       return pre;
    }
}
