package Leetcode328;
class  ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next =next;
    }
}
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd = head;
        ListNode even =head.next;
        //奇数偶数结点头
        ListNode even_head = head.next;
        //记录偶节点头直接接在奇数结点头后面
        ListNode cur =head.next; //游标指针
        if(cur==null) return head;
        int i=1;
        while(cur!=null)
        {
            if(i%2==1&&cur.next!=null){odd.next=cur.next; odd = odd.next; }
            //要是结点数量是偶数个的话，会出现奇数指针指向空的情况
            else{even.next = cur.next; even=even.next;}
            cur = cur.next;
            i++;
        }

        odd.next =even_head ;

        return head;
    }
}
