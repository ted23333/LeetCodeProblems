package LeetcodeTry;
import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public static void main(String[] args) {
       boolean so = new Solution().isAnagram("anagram","nagaram");
    }
   public boolean isAnagram(String s,String t){
       char []char_s = s.toCharArray();
       char []char_t =t.toCharArray();
       HashMap<Character,Integer> hash_s = new HashMap<>();
       for(Character c:char_s)
       {
           int count = hash_s.getOrDefault(c,0)+1;
           hash_s.put(c,count);
       }
       for(Character c:char_t)
       {
           int count =hash_s.getOrDefault(c,0)-1;
           hash_s.put(c,count);
           if(count==0) hash_s.remove(c);

       }
       return hash_s.size()==0;
   }
}
