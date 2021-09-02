package offer33;
/*
递归分治的方法
当i大于j说明此时子树节点数量小于等于1 直接返回true
否则划分子树，寻找第一个大于根节点的节点 索引记为m，此时可以划分出左子树区间i m-1 右子树区间 m j-1
左子树的节点都应该小于根节点 右子树节点都应该大于根节点
要求所有子树都正确才可以 划分左右子树 保证了左子树的正确性

*/
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}

