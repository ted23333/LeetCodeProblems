package Leetcode26;
//思路和26题一样，只不过这次要检验是不是重复的，第一个元素肯定是不重复的，只要检验后一个
// 元素和前面一个元素一不一样就可以，如果一样的话就不加进去
public class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 1;

            for (int j = 1; j < nums.length; j++) {

                if (nums[j] != nums[j-1]) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;

    }
}
