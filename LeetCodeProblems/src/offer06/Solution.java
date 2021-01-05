package offer06;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }}
    public int[] reversePrint(ListNode head) {
       ListNode currNode = head;
       int len = 0;
       while(currNode!=null)
       {
           len++;
           currNode = currNode.next;
       }
        int []result = new int[len];
       currNode = head;
       while(currNode!=null)
       {
           result[len-1] = currNode.val;
           len--;
           currNode = currNode.next;
       }
       return result;
    }
}
