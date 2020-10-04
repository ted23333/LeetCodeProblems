package Leetcode367;
// 有效的完全平方数
public class Solution {

    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        if(num==1) return true;
        int mid = left+(right-left)/2;
        while(left<right)
        {
            mid = left+(right-left)/2;
            if(num/mid==mid&&num%mid==0) return true;
            else if(num/mid<mid) right=mid;
            else left =mid+1;
        }
        return false;
    }
}
