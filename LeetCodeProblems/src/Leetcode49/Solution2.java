package Leetcode49;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 字母异位词分组
// 使用map统计字词
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> map= new HashMap<>();
      for(String str:strs){
          int [] counts = new int[26];
          int length = str.length();
          for(int i = 0;i<length;i++)
          {
              counts[str.charAt(i)-'a']++;
          }
          StringBuffer sb = new StringBuffer();
          for(int i = 0;i<26;i++)
          {
              if(counts[i]!=0 )
              {
                  sb.append((char)('a'+i));
                  sb.append(counts[i]);
              }
          }
          // 构造特征字符串
          String key = sb.toString();

          List<String> list = map.getOrDefault(key,new ArrayList<String>());
          list.add(str);
          map.put(key,list);
      }
      return new ArrayList<List<String>>(map.values());
    }
}
