package Leetcode143;

public class Solution2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
  public  void reorderList(ListNode head )
  {
      if(head == null) return;
      ListNode mid  = middleNode(head);
      ListNode l1 =head;
      ListNode l2 = mid.next;
  }
  public ListNode middleNode(ListNode head){
        ListNode slow  = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow  = slow.next;
            fast = fast.next.next;
        }
        return slow;
  }
  public ListNode reverseList(ListNode head){
        ListNode prev= null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
  }
  public void mergeList(ListNode l1,ListNode l2)
  {
      ListNode l1_temp;
      ListNode l2_temp;
      while(l1!=null &l2!=null)
      {
          l1_temp = l1.next;
          l2_temp = l2.next;
          l1.next = l2;
          l1 = l1_temp;
          l2.next = l1;
          l2 = l2_temp;
      }
  }




}
