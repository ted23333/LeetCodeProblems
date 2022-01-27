package Leetcode1047;

import java.util.Deque;
import java.util.LinkedList;


public class Solution {
    public String removeDuplicates(String s) {
      int length = s.length();
      if(length == 1) return s;
      StringBuilder sb = new StringBuilder();
      Deque<Character> dq = new LinkedList<Character>();

      for(int i =0;i<length;i++)
      {
          if(dq.isEmpty()||s.charAt(i)!=dq.peekLast()) dq.addLast(s.charAt(i));
          // 空的话就压进去
          else dq.pollLast();
      }
      while(!dq.isEmpty())
      {
          sb.append(dq.pollFirst());
      }
      return sb.toString();
    }
}
