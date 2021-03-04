package Leetcode17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 电话号码的字母组合
// 回溯算法
public class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> combinations = new ArrayList<>();
       if(digits.length()==0){
           return combinations;
       }
       // 如果是空数字的话就返回一个空的列表
        Map<Character,String> phoneMap =  new HashMap<Character,String>(){{
            put('2',"abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        // 声明电话表
        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }
    public void backtrack(List<String> combinations,Map<Character,String> phoneMap,String digits,int index,StringBuffer combination)
    {
        if(index == digits.length()){
            combinations.add(combination.toString());
        }
        else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            // 找到每一个数字对应的字符集合
            int lettersCount = letters.length();
            for(int i=0;i<lettersCount;i++)
            {
                combination.append(letters.charAt(i));
                backtrack(combinations,phoneMap,digits,index+1,combination);
                combination.deleteCharAt(index);
                // 此处是回溯，为什么要回溯呢？
            }
        }
    }

}
