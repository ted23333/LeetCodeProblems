package Leetcode744;

public class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length;

        if(target>=letters[letters.length-1]){//循环比较的处理
            return letters[0];
            // 如果目标在集合之外的话，那么就返回排序数组的第一个字母
        }else{
            while (left<right){//二分搜索的应用
                int mid=(left+right)/2;
                if(letters[mid]<=target)left=mid+1;
                if(letters[mid]>target)right=mid;
            }
            return letters[left];
        }
    }



}
