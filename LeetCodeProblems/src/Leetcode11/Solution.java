package Leetcode11;
// update in 07/25/2021
public class Solution {
    public int maxArea(int[] height)
    {
        // 初始化双指针分列水槽左右两端，
        // 循环每一轮将短板向内移动一格，并更新最大值
        // 直到两个指针相遇的时候跳出，即可得到最大的面积
        int res =0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int area = (j-i) *Math.min(height[i],height[j] );
            res  = Math.max(res,area);
            if(height[i]<height[j]){i++;
        }
            else{
                j--;
            }
    }
        return res;
}}
