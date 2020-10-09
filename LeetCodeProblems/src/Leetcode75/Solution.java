package Leetcode75;


import java.util.Arrays;


// 颜色分类
// 双指针
/* 设定len 是数组的长度
变量zero是前两个子区间的分界点，一个是闭区间，一个就必须是开区间
变量i是循环变量，一般设置为开区间，表示i之前的元素是遍历过的
two是另一个分界线，设计成闭区间

最终结果应该是：
所有在子区间[0,zero)的元素都等于0
所有在子区间[zero,i)的元素都等于1
所有在子区间[two,len-1]的元素都等于2
 */
class Solution {

 public void sortColors(int[] nums){
   int length = nums.length;
   if(length<2) return;
   int zero =0;
   int two = length;
   int i=0;
   while(i<two)
   {
    if(nums[i]==0)
    {
     swap(nums,i,zero);
     zero++;
     i++;
    }
    else if(nums[i]==1) i++;
    else{
     two--;
     // 这里要先自减，因为首个two的位置是越界的
     swap(nums,i,two);
    }
   }
 }
 private void swap(int[] nums, int index1,int index2)
 {
  int temp = nums[index1];
  nums[index1] = nums[index2];
  nums[index2] = temp;
 }
}
