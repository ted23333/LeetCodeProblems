package Leetcode557;

public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        // 反着加进去  stringbuffer这块要加上tostring()
        return res.toString().trim();
    }
}

