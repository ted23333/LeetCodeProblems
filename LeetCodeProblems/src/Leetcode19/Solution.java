package Leetcode19;



public class Solution {

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){

        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null||(head.next==null&&n==1)) return null;
        ListNode Position = head;
        ListNode Deletes = head;
      for(int i=0;i<n;i++ )
        {
            Position= Position.next;
        }
        if(Position==null) return head.next;
        //假如输入用例是[1,2]就会报错，所以可以考虑加一个dummyhead;
        while(Position.next!=null&&Deletes.next!=null)
        {
            Position = Position.next;
            Deletes = Deletes.next;
        }
        Deletes.next=Deletes.next.next;
        return head;
    }
}
