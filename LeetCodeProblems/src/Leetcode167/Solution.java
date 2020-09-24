package Leetcode167;



class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int index1=0,index2= numbers.length-1;
      while(index1<index2)
      {
          if(numbers[index1]+numbers[index2]==target) break;
          if(numbers[index1]+numbers[index2]>target){index2--;}
          else index1++;
      }
      int []result = {index1+1,index2+1};
      return result;
    }
}