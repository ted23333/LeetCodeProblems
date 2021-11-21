package Leetcode67;

public class Solution2 {
    public String addBinary(String a, String b) {
      int length_a = a.length();
      int length_b = b.length();
      int i=length_a-1,j = length_b-1;
        StringBuilder sb= new StringBuilder();
        int carry = 0;
      while(i>=0||j>=0)
      {
          int a_char = i>=0 ? (int) a.charAt(i) - (int)'0': 0;
          int b_char = j>=0 ? (int) b.charAt(j) - (int)'0': 0;
          sb.append((a_char+b_char+carry)%2);
          carry = (a_char+b_char+carry)/2;
          i--;
          j--;
      }
      if(carry!=0) sb.append(carry);
      return sb.reverse().toString();
    }
}
