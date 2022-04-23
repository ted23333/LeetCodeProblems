package net;

import java.util.HashSet;

public class Solution {
    public String getDelCharAndCnt(String str)
    {
        StringBuilder sb = new StringBuilder();
        int []chars = new int[26];
        int len = str.length();
        for(int i = 0;i<len;i++)
        {
            chars[str.charAt(i)-'a']++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j = 0;j<len;j++)
        {
            if(chars[j]==0) continue;
            else{
                if(set.isEmpty())
                {
                    set.add(chars[j]);
                }
                else
                {
                    if(!set.contains(chars[j]))
                    {
                        set.add(chars[j]);
                    }
                    else
                    {
                        int num = chars[j];
                        while(--num>=0)
                        {
                            if(set.contains(num)) continue;
                            else {
                                if(num!=0)
                                set.add(num);
                                char thischar = (char)('a'+j);
                                sb.append(thischar);
                                sb.append(":");
                                sb.append(chars[j]-num+";");
                                break;
                            }
                        }
                    }
                }

            }
        }
        return sb.toString();
    }
}
