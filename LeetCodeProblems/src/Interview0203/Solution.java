package Interview0203;
 // 删除给定的结点
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
     public void deleteNode(ListNode node) {
         node.val = node.next.val;
         node.next = node.next.next;
     }
}
