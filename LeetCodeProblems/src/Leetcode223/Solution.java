package Leetcode223;

class Solution {
    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // 找出最大左边界 最小右边界 最大下边界 最小上边界
        int up=Math.min(ay2,by2),down=Math.max(ay1,by1),left=Math.max(ax1,bx1),right=Math.min(ax2,bx2);
        int sum;
        if(left>=right||up<=down)sum=0;
        else sum=(up-down)*(right-left);
        return (ay2-ay1)*(ax2-ax1)+(by2-by1)*(bx2-bx1)-sum;
    }


}
