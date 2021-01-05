package Interview0205;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(0);
        // 设置一个结点返回结果链表
        ListNode p1=node;
        // 设置遍历结点
        int carry=0;
        while(l1!=null || l2!=null ||carry>0){
            // 只要还有链表没有被处理完，或者进位不等于0，就应该继续循环
            int i=l1!=null?l1.val:0;
            // 链表1不为空就取当前位，否则赋值0
            int j=l2!=null?l2.val:0;
            // 链表2不为空就取当前位，否则赋值0
            int num=i+j+carry;
            // 相加得到下一位的情况
            p1.next=new ListNode(num%10);
            // 对num取模
            carry=num/10;
            // 计算是否要进位
            p1=p1.next;
            // 指针继续向下推进
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            //如果 链表不为空，那就链表进位
        }
        return node.next;
        //返回链表的下一个元素
    }
    }

