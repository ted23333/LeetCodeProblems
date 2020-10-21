package Leetcode345;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
       char []char_array = s.toCharArray();
       int i=0;
       int j= s.length()-1;
       Set<Character> yuanyin__Set = new HashSet<>();
       yuanyin__Set.add('a');
       yuanyin__Set.add('e');
       yuanyin__Set.add('i');
       yuanyin__Set.add('o');
       yuanyin__Set.add('u');
       while(i<j)
       {
           while (i < j && !yuanyin__Set.contains(Character.toLowerCase(char_array[i]))) {
               ++i;
           }
           while(i<j&& !yuanyin__Set.contains(Character.toLowerCase(char_array[j])))
           {
               --j;
           }
           if(i<j)
           {
               swap(char_array,i,j);
               i++;
               j--;
           }
       }
      return String.copyValueOf(char_array);
    }
    private void swap(char[] char_array,int i, int j)
    {
        char temp  = char_array[i];
        char_array[i] = char_array[j];
        char_array[j] = temp;
    }
}