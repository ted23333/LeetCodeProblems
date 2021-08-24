package offer11;
//  旋转数组的最小数字
public class Solution {
    public int minArray(int[] numbers) {
     int length = numbers.length;
     int left = 0,right = length-1;
      int mid = left+ (right-left)/2;
     while(left<right)
     {

         mid = left+ (right-left)/2;
        // 右边界一定小于左边界 否则不合法
         if(numbers[mid]>numbers[left]) left = mid;
         else if(numbers[mid]<numbers[right]) right = mid-1;
         else left = left+1;
     }
     return numbers[mid];
    }
}
