package Leetcode82;
// 删除排序链表中的重复元素Ⅱ
public class Solution {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    // 增加一个哑结点
    public ListNode deleteDuplicates(ListNode head){
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode a = dummy;
        ListNode b = head;
        // 初始设置两个结点分别指向哑结点和哑结点的下一个结点
        while(b!=null && b.next !=null){
            if(a.next.val != b.next.val){
                a = a.next;
                b = b.next;
            }
            // 如果当前结点没有存在重复的情况的话，就把两个指针向下一个结点推进
            else {
                while(b!=null&&b.next!=null&&a.next.val==b.next.val)
                {
                    b = b.next;
                }
                // 如果重复的话就把b向后移
                a.next = b.next;
                b = b.next;
                //a的next依然是b
            }
        }
        return dummy.next;
    }

}
