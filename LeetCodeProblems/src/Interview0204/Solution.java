package Interview0204;

public class Solution {
    /**
     * 双指针法
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗：37.6 MB, 在所有 Java 提交中击败了100.00% 的用户
     * @param head
     * @param x
     * @return
     */
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        //左链表虚拟头节点
        ListNode leftOne = new ListNode(-1);
        ListNode left = leftOne;
        //右链表虚拟头节点
        ListNode rightOne = new ListNode(-1);
        ListNode right = rightOne;
        //因为有断开操作,所以需要记录下一个遍历的节点
        ListNode next;
        while (head != null) {
            next = head.next;

            //值小于x的节点都接在左链表,其他接在右链表上
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            //断开操作
            head.next = null;

            head = next;
        }
        //拼接操作 左链表尾节点指向右链表头节点
        left.next = rightOne.next;
        return leftOne.next;
    }


}
