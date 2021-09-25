package offer66;
// 构建乘积数组
public class Solution {
    public int[] constructArr(int[] a) {
        int length = a.length;
        if (length == 0) return new int[0];
        int res[] = new int[length];
        int pre[] = new int[length];
        int aft[] = new int[length];
        pre[0] = a[0];
        aft[length - 1] = a[length - 1];
        for (int i = 1; i < length; i++) {
            pre[i] = pre[i - 1] * a[i];
        }
        for (int j = length - 2; j >= 0; j--) {
            aft[j] = aft[j + 1] * a[j];
        }
        res[0] = aft[1];
        res[length - 1] = pre[length - 2];
        for (int i = 1; i < length - 1; i++) {
            res[i] = pre[i - 1] * aft[i + 1];
        }
        return res;
    }
}
