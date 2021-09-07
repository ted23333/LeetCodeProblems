package offer50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public char firstUniqChar(String s) {
        HashSet<Character> set  = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        int length = s.length();
        for(int i = 0;i<length;i++)
        {
          if(set.add(s.charAt(i)))
          {
              queue.offer(s.charAt(i));
          }
          else
          { if(queue.peek().equals(s.charAt(i)))
          {
              queue.poll();
          }}
        }
        return queue.peek()==null?' ': queue.poll();
    }
}