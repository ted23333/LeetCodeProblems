package Leetcode88;

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int []result = new int[m+n];
      int i = 0,j = 0;
      int p = 0;
      while(p<m+n)
      {
          if(i<m&&j<n)
          result[p++] = nums1[i]<=nums2[j]?nums1[i++]:nums2[j++];
          else if(i==m)
              result[p++] = nums2[j++];
          else result[p++] = nums1[i++];
      }
      nums1 = result;
        while(p>0)
        {
            nums1[p-1] = result[p-1];
            p--;
        }
    }

}
