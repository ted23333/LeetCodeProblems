package Leetcode109;
// 有序链表转换二叉搜索树
public class Solution {
       class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
      return buildTree(head,null);
    }
    public TreeNode buildTree(ListNode left,ListNode right){
           if(left == right) {
               return null;}
               ListNode mid = getMedian(left, right);
               TreeNode root = new TreeNode(mid.val);
               root.left = buildTree(left, mid);
               // 左侧结点等于左半边的中点
               root.right = buildTree(mid.next, right);
               // 右侧结点等于右半边的中点
               return root;
       }
       public ListNode getMedian(ListNode left,ListNode right){
           ListNode fast = left;
           ListNode slow = left;
           while(fast!=right&&fast.next!=right){
               fast = fast.next;
               fast = fast.next;
               slow  = slow.next;
           }
           // 使用快慢指针法寻找链表的中点
           return slow;
       }

}
