package Leetcode707;
// Leetcode 707
public class MyLinkedList {
     private class Node{
         public int val;
         public Node next;
         public Node (int val,Node next){
             this.val =val;
             this.next = next;
         }
         public Node(int val){
             this(val,null);
         }
         public Node(){
             this(0,null);
         }
     }  // 节点类定义
    // 使用虚拟头结点
    private Node dummyHead;
     private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
         dummyHead = new Node();
         size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0||index>=size) return -1;
        Node cur = dummyHead.next;
        for(int i=0;i<index;i++)
        {
            cur  = cur.next;
        }
    return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
       if(index<0||index>size)
           return;
        Node prev = dummyHead;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
        prev.next = new Node(val,prev.next);
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
     if(index<0||index>=size) return;
     Node prev = dummyHead;
     for(int i=0;i<index;i++)
     {
         prev  = prev.next;
     }
     Node retNode =prev.next;
     prev.next = retNode.next;
     retNode.next = null;
     size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */