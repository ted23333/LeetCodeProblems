package Leetcode299;

import java.util.HashMap;

class Solution {
    public String getHint(String secret, String guess) {
      char []char_secret = secret.toCharArray();
      char []char_guess = guess.toCharArray();
      int length = char_guess.length;
      int[] map_secret = new int[10];
      int[] map_guess = new int[10];
      int A_cnt =0;
     for(int i = 0;i<length;i++)
     {
         if(char_guess[i]==char_secret[i]) A_cnt++;
         map_secret[char_secret[i]-'0']++;
         map_guess[char_guess[i]-'0']++;

     }
     int B_cnt=-A_cnt;
     for(int i=0;i<10;i++)
     {
        B_cnt +=Math.min(map_guess[i],map_secret[i]);
     }
    return ""+A_cnt+"A"+B_cnt+"B";
    }
}
