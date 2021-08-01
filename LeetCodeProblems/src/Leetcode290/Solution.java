package Leetcode290;

import java.util.HashMap;

// 单词规律
public class Solution {

    public boolean wordPattern(String pattern, String s) {

        char [] pa = pattern.toCharArray();
        String[] sp = s.split(" ");

      if(sp.length!=pa.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map_reverse = new HashMap<>();
        for(int i=0;i<sp.length;i++)
        {
         if(map.containsKey(pa[i]))
         {
             if(!map.get(pa[i]).equals(sp[i]))
             return false;
         }// 如果键值对出现过了并且不一致，说明对应的模式不对 这里一定要用equals ==判断的是对象

          else map.put(pa[i],sp[i]);
            if(map_reverse.containsKey(sp[i]))
            {
                if(!map_reverse.get(sp[i]).equals(pa[i]))
                    return false;
            }// 如果键值对出现过了并且不一致，说明对应的模式不对 这里键值对反一下

            else map_reverse.put(sp[i],pa[i]);
        }
        return true;
    }
}
