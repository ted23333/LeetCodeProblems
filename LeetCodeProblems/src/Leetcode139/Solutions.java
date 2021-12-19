package Leetcode139;

import java.util.HashSet;
import java.util.List;

// 单词拆分 没有通过
public class Solutions {
    HashSet<String> set = new HashSet<>();
    int maxword = 0;
   boolean flag = false;
    int n;
    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        for(String word:wordDict)
        {set.add(word);
        maxword = Math.max(maxword,word.length());
        }
        // 把词语放进表中
        for(int i =1;i<=maxword&&i<=n;i++)
        {
            flag = flag|| dfs(s,0,i);
        }
        return flag;
    }
    boolean dfs(String s,int i,int j)
    {
        if(j==n) return true;
        if(set.contains(s.substring(i,j)))
        {

            for(int t= 1;j+t<=n&&t<=maxword;t++)
                dfs(s,j,j+t);

        }
        return false;
    }
}
