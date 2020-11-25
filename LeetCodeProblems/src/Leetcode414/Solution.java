package Leetcode414;
// 设置三个变量，最小值为long类型的最小值，测试用例会使用Integer类型的最小值导致出错
// 如果大于最大值，则把第二大值赋值给第三大值，把第一大值赋值给第二大值，把当前值赋值给第一大值 1
// 如果大于第二大值，则把第二大值赋值给第三大值， 2
// 如果大于第三大值，则把第三大值替换掉 3
public class Solution {
public int thirdMax(int[] nums){
    if(nums.length ==1) return nums[0];
    if(nums.length ==2) return nums[0]>=nums[1]?nums[0] :nums[1];
    long firstMax = Long.MIN_VALUE;
    long secondMax = Long.MIN_VALUE;
    long thirdMax = Long.MIN_VALUE;
    for(int num:nums){
        if(num>firstMax)
        {
            // 情况1
            thirdMax = secondMax;
            secondMax = firstMax;
            firstMax = num;
        }
        else if(num==firstMax) continue;
        else if(num>secondMax){
            // 情况2
            thirdMax = secondMax;
            secondMax = num;
        }
        else if(num ==secondMax){
            continue;
        }
        else if(num>thirdMax){
            thirdMax =num;
        }
    }
    if(thirdMax == Long.MIN_VALUE){
        return (int)firstMax;
    }
    else {
        return (int)thirdMax;
    }
}
}
