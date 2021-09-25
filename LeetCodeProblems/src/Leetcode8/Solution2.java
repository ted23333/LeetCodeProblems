package Leetcode8;
// 20210923
public class Solution2 {

    public int myAtoi(String str) {
      int length = str.length();
      char  []charArray = str.toCharArray();
      int index = 0;
      // 去掉前导空格
      while(index<length&&charArray[index]==' ')
      {
          index++;
      }
      if(index ==length)
          return 0;
      int signal = 1;
      char thischar = charArray[index];
      if(thischar == '+')
      {
          index++;
      }
      else if(thischar == '-')
      {
          index++;
          signal =-1;
      }
      int result = 0;
      while(index<length)
      {
          char currchar = charArray[index];
          if(currchar>'9'||currchar<'0')
          {
              break;
          }
          if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&(currchar-'0')>Integer.MAX_VALUE%10))
          return Integer.MAX_VALUE;
          if (result < Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&(currchar-'0')>-Integer.MIN_VALUE%10))
              return Integer.MIN_VALUE;
          result = result*10+signal*(currchar-'0');
          index++;
      }
      return result;


}}

