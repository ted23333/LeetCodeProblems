package offer58_2;

public class Solution {
    public String reverseLeftWords(String s, int n) {
      int length = s.length();
      StringBuilder sb = new StringBuilder();
      sb.append(s.substring(n,length));
      sb.append(s.substring(0,n));
      return sb.toString();
    }
}
