package offer36;
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
class Solution {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur) {
        // 中序遍历的时候相当于最先访问最小元素的节点 因此修改指针就可以完成整个的二叉树转换
        if(cur == null) return;
        dfs(cur.left);
        if(pre != null) pre.right = cur;
        // 如果pre节点不为空。那么更改指针当前访问节点的前驱节点指向当前节点
        else head = cur;
        // pre为空，cur就是头节点
        cur.left = pre;
        // 修改左指针
        pre = cur;
        dfs(cur.right);
    }
}