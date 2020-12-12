package Leetcode143;

import java.util.ArrayList;
import java.util.List;

// 重排链表  简单的做法可以使用一个额外的数据结构存储
// 空间复杂度为O(1)的做法：寻找链表中点+链表逆序+合并链表
public class Solution {
     class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 public void reorderList(ListNode head){
         if(head ==null) return;
     List<ListNode> list  = new ArrayList<ListNode>();
     ListNode node  = head;
     while(node!=null) {
         list.add(node);
         node = node.next;
     }
     int i = 0,j = list.size()-1;
     while(i<j)
     {
         list.get(i).next = list.get(j);
         i++;
         if(i==j) {
             break;
         }
         list.get(j).next = list.get(i);
         j--;
     }
     list.get(i).next =null;
 }

}
