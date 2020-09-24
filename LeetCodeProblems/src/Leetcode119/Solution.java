package Leetcode119;

import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> getRow(int rowIndex) {
           List<List<Integer>> result = new ArrayList<List<Integer>>();
           result.add(new ArrayList<>());
           result.get(0).add(1);
           if(rowIndex==0) return result.get(0);
           for(int i=1;i<=rowIndex;i++)
           {
               List<Integer> row = new ArrayList<>();
               List<Integer> prevRow = result.get(i-1);

               // The first row element is always 1.
               row.add(1);
               for(int j=1;j<i;j++)
               {
                   row.add(prevRow.get(j-1)+prevRow.get(j));
               }
               row.add(1);
               result.add(row);
           }
           return result.get(rowIndex);
    }
}