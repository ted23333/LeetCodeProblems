package Leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 20210927
public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(n<3) return ans;
        // 设定三个指针 i,L,R 后两个指针
        for(int i = 0;i<n-2;i++)
        {
            if(nums[i]>0) return ans;
            if(i>0&&nums[i]==nums[i-1]) continue;
            // 避免i重复
            int curr = nums[i];
            int L = i+1,R = n-1;
            while(L<R)
            {
                int tmp = curr+nums[L]+nums[R];
                if(tmp==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    ans.add(list);
                    while(L<R&&nums[L+1]==nums[L]) ++L;
                    while(L<R&&nums[R-1]==nums[R]) --R;
                    ++L;
                    --R;
                }
                else if(tmp<0) ++L;
                else --R;
            }
        }
        return ans;



    }

}
