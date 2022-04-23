package TenMusic2;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return int整型
     */
    public int minCnt (String s) {
        char [] arr = s.toCharArray();
        int size = arr.length;
        boolean flag = false;
        int del = 0;
        for(int i = 0;i<size;i++)
        {
            if(!flag)
            {
                if(arr[i]=='0') del++;
                else flag = true;
            }
            else{
                if(arr[i]=='1') del++;
            }

        }
        return del;
        // write code here
    }
}