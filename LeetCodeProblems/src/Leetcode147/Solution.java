package Leetcode147;
// 对链表进行插入排序
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }}
    public ListNode insertionSortList(ListNode head)
    {
        if(head ==null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted =head,curr = head.next;
        while(curr!=null)
        {
            if(lastSorted.val <=curr.val){
                lastSorted = lastSorted.next;
            }
            // 如果前面的数组有序，向后遍历
            else {
                // 否则从哑头结点向后搜索插入
                ListNode prev = dummyHead;
                while(prev.next.val<=curr.val)
                {
                    prev = prev.next;
                }
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }
}
