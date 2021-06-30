package Leetcode388;

import java.util.Stack;

// 文件的最长绝对路径
class Solution {
    public int lengthLongestPath(String input) {
        int size = input.length();
        int res = 0;
        //栈中有几个元素就表示当前遍历到了第几层
        Stack<Integer> st = new Stack<>();
        for(int i = 0, sum = 0; i < size; i++) {
            int k = 0;//每次重新统计当前元素在第几层
            while(i < size && input.charAt(i) == '\t') {i++;k++;}
            while(st.size() > k) sum -= st.pop(); //这行代码是全局精华，假设我们扫描到了2个
           // '\t'（第一次），就说明当前元素在第三层（对照图数一下），因为第三层有很多同级元素，然后下次（第二次）又扫描到了有2个'\t'，
            // 但是此时栈中有三个元素了，即 3 > 2，因此要弹出栈中的一个元素，就好处遍历到叶子节点了，自然要回溯到父节点继续遍历下一个元素
            int j = i;
            while(j < size && input.charAt(j) != '\n') j++;
            int len = j - i;
            st.push(len);
            sum += len;
            if(input.substring(i, i + len).indexOf('.')!=-1) {
                res = Math.max(res, sum + st.size() - 1);
            }
            i = j;
        }
        return res;
    }
}


