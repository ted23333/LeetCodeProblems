package offer22;
 // 链表中倒数第k个节点
class Solution {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val =x;}
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode point_first = head;
        ListNode point_second = head;
        for(int i = 0;i<k;i++)
        {
            point_second = point_second.next;
        }
        while(point_second!=null)
        {
            point_first = point_first.next;
            point_second = point_second.next;
        }
        return point_first;
    }
}