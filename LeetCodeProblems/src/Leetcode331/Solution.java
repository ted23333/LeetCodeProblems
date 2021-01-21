package Leetcode331;
// 验证二叉树的前序序列化
/*
定义一个概念称之为槽位，二叉树中任意一个结点或者空孩子结点都要占据一个槽位，
二叉树的建立伴随着槽位数量的变化，开始的时候只有一个槽位，如果根节点是空结点
就只消耗一个槽位，如果根结点不是空结点，除了消耗一个槽位，还要为孩子结点增加两个新的槽位
之后的结点也是同理。
开始时只有一个可用槽位
空结点和非空结点都消耗一个槽位
空结点不增加槽位，非空结点增加两个槽位
 */
class Solution {
    public boolean isValidSerialization(String preorder) {
        // number of available slots
        int slots = 1;
        // 初始可用槽位为1
        int n = preorder.length();
         // n+1
        for(int i = 0; i < n; ++i) {
            if (preorder.charAt(i) == ',') {
                // one node takes one slot
                --slots;

                // no more slots available
                if (slots < 0) return false;

                // non-empty node creates two children slots
                if (preorder.charAt(i - 1) != '#') slots += 2;
            }
        }

        // the last node
        slots = (preorder.charAt(n - 1) == '#') ? slots - 1 : slots + 1;
        // all slots should be used up
        return slots == 0;
    }
}


