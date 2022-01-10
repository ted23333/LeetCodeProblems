package Leetcode31;
// 下一个排列
// 将左边一个较小的数字和右边一个较大的数交换
// 同时要让这个较小的数尽可能靠右，较大数尽可能小。交换完成后，较大数右边的数字需要按照升序重新排列
// 算法描述
/*
1 从后向前寻找第一个顺序对（i,i+1）满足a[i]<a[i+1],较小的数字是a[i] 此时[i+1,n)必然是降序序列
2 如果找到了顺序对 在区间[i+1,n)中从后向前查找第一个元素j满足a[i]<a[j] 这样较大的数是a[j]
3 交换a[i]与a[j] 可以证明区间[i+1,n)必为降序，可以直接使用双指针反转区间[i+1,n)使其变为升序，无需对该区间进行排序
如果在1中找不到顺序对，说明当前序列已经是降序序列 即最大的序列 直接执行3变成升序排列
 */
public class Solution {
    public void nextPermutation(int[] nums)
    {
        int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j = nums.length-1;
            while(j>=0&&nums[i]>=nums[j])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
  public void swap(int []nums,int i,int j)
  {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
  }
  public void reverse(int[] nums,int start)
  {
      int left = start,right = nums.length-1;
      while(left<right){
      swap(nums,left,right);
      left++;
      right--;}
  }
}
