package offer05;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// 替换空格
public class Solution {
    public String replaceSpace(String s) {
    StringBuilder res = new StringBuilder();
        Deque<Integer> arr = new LinkedList<>();
        arr.toArray();
    for(Character c:s.toCharArray())
    {
        if(c == ' ') res.append("%20");
        else res.append(c);
    }
    return res.toString();
    }
}
