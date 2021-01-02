package Interview0207;

public class Solution {
    public class ListNode {
        int val;
       ListNode next;
        ListNode(int x) { val = x; }}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1 != t2){
            t1 = t1 != null ? t1.next : headB;
            // 不为空就向下遍历
            t2 = t2 != null ? t2.next : headA;
            // 为空的话说明遍历到该段的结尾，从另一段链表的头结点开始遍历，知道两个链表相交
        }
        return t2;
    }
}


