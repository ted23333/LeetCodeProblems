package Leetcode817;

import java.util.HashSet;
import java.util.Set;

// 链表组件
class Solution {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> Gset = new HashSet();
        for (int x: G) Gset.add(x);
        // 将G集合中的所有元素加入hashset中
        ListNode cur = head;
        int ans = 0;

        while (cur != null) {
            if (Gset.contains(cur.val) &&
                    (cur.next == null || !Gset.contains(cur.next.val)))
                ans++;
            cur = cur.next;
        }
        // 判断组件的数量
        return ans;
    }


}