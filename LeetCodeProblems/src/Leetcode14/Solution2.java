package Leetcode14;

public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        int st = strs.length;
        int length = Integer.MAX_VALUE;
        for(int i=0;i<st;i++)
        {
            length = Math.min(length,strs[i].length());
        }
        if(length==0) return "";
        int current = 0;
        for(int i = 0;i<length;i++)
        {
            current = i;
            String sub = strs[0].substring(0,i+1);
            for(int j = 0;j<st;j++)
            {

                if(!strs[j].substring(0,i+1).equals(sub))
                {
                    return i-1>=0?strs[0].substring(0,i):"";
                }
            }

        }
        return strs[0].substring(0,current+1);
    }
}

