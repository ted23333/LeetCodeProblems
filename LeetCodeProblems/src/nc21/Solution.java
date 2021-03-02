package nc21;
// 链表指定区间反转
public class Solution {
      public class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x){
        this.val  = x;
    }
  }
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head == null) return null;
        ListNode res = new ListNode(-1);
        res.next = head; // -1->1->2->3->4->5
        // 声明一个虚拟头结点
        ListNode pre = res; //备份指针
        //移动指针，找到m之前的位置
        for(int i = 1; i<m; i++){
            pre = pre.next; //指向1
        }
        //创建当前指针
        ListNode cur = pre.next; //指向2
        //反转链表，从m这个位置开始到n
        for(int i = m; i < n; i++){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return res.next;
    }

}
