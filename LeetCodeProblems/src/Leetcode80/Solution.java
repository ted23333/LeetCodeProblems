package Leetcode80;

class Solution {
// 80 删除
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                  //如果出现了重复的元素。count++
                count++;
            } else {
                //否则重置
                count = 1;
            }


            if (count <= 2) {
               // 假如超过3的话这个指针就不走了，由下一个不重复的元素覆写
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}


