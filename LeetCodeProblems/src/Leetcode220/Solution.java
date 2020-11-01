package Leetcode220;
import java.util.TreeSet;

// 存在重复元素Ⅲ
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        // 这里使用一个树集来做判断，树集中的元素是有序的
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > k) {
                set.remove((long)nums[i - k -1]);
                //此处是i>k 而不是size> k ,所以要这么写
                // 如果加入TreeSet的元素大于k个，就要考虑从集合中删除元素
            }
            Long low = set.ceiling((long) nums[i] - t);
            // 返回集合中大于等于给定元素的最小元素
            //是否找到了符合条件的数
            if (low != null && low <= (long)nums[i] + t) {
                return true;
            }
            // 满足条件就可以添加进TreeSet集合里面
            set.add((long) nums[i]);
        }
        return false;
    }


}
