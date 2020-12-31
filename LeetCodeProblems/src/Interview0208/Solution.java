package Interview0208;

// 环路检测
// 思路：利用快慢指针判断有没有环路，如果有，则快慢指针会在某点相遇，但是相遇的点不一定是环的入口
// 设链表的头结点到环的入口节点的距离为s1，入口节点到二者相遇点的距离为s2
// 快指针移动的距离是y1 = (s1+s2+xn) 快指针先从头结点跑到相遇结点，然后在环里不断的跑，x为跑的圈数 直到遇到慢指针
//  慢指针移动的距离是y2 = s1+s2 y1 = 2 y2
public class Solution {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }


  }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            //快慢指针，快指针每次走两步，慢指针每次走一步
            fast = fast.next.next;
            slow = slow.next;
            //先判断是否有环，
            if (slow == fast) {
                //确定有环之后才能找环的入口
                while (head != slow) {
                    //两相遇指针，一个从头结点开始，
                    //一个从相遇点开始每次走一步，直到
                    //再次相遇为止
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }}

