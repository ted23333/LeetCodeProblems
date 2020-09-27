package Leetcode220;
import java.util.TreeSet;

// 存在重复元素Ⅲ
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > k) {
                set.remove((long)nums[i - k -1]);
                //此处是i>k 而不是size> k ,所以要这么写
            }
            Long low = set.ceiling((long) nums[i] - t);
            //是否找到了符合条件的数
            if (low != null && low <= (long)nums[i] + t) {
                return true;
            }
            set.add((long) nums[i]);
        }
        return false;
    }


}
