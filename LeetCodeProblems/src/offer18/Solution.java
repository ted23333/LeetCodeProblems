package offer18;
// 删除列表的结点
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode cur = dummyhead;
        while (cur.next != null) {
            if(cur.next.val==val)
                cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummyhead.next;
    }
}

