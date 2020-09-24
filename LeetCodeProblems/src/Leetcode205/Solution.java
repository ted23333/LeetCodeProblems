package Leetcode205;

import java.util.HashMap;
import java.util.HashSet;

// 205 同构字符串
// 思路：两个同构字符串就是保证字符串s可以唯一映射到他，同时t可以唯一映射到s
public class Solution {
    private boolean isisIsomorphicHelper(String s, String t)
    {
        int n= s.length();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2)
                {
                    return false;
                }
            }
            else map.put(c1,c2);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
    return isisIsomorphicHelper(s,t) && isisIsomorphicHelper(t,s);
    }

}
