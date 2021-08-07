package Leetcode275;
// h指数，只要找到了一个citations[i]>h 就有h的增长
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + r >>1;
            if (citations[mid] >= n - mid) r = mid;
            else l = mid + 1;
        }
        return citations[r] >= n - r ? n - r : 0;
    }
}
