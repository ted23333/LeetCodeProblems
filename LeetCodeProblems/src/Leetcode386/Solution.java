package Leetcode386;

import java.util.ArrayList;
import java.util.List;

// 字典序输出
// 相当于先序输出二叉树
class Solution {
    List<Integer> lst = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int i = 1 ; i < 10 ; i++){
            dfs(n , i);
        }
        return lst;
    }
    public void dfs(int n , int t){
        if(t <= n){
            lst.add(t);
        }else{
            return;
        }
        for(int i = 0 ; i < 10 ; i++){
            dfs(n , 10*t+i);
            // 字典序输出，以i为开头的
        }
    }
}


