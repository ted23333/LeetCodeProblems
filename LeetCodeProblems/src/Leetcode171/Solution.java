package Leetcode171;

public class Solution {
    public int titleToNumber(String columnTitle) {
       char [] charTitle = columnTitle.toCharArray();
       int result = 0;
       for(int i = 0;i<charTitle.length;i++)
       {   if(i!=0) result *=26;
           result += (int)(charTitle[i]-'A') + 1;
       }
       return result;
    }
}
