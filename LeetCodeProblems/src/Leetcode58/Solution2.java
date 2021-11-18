package Leetcode58;

public class Solution2 {

    public int lengthOfLastWord(String s) {
     String []strs = s.split(" ");
     int Length = 0;
      Length = strs[strs.length-1].length();
        return Length;
    }
}
