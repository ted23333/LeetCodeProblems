package TenMusic3;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int minMax (ArrayList<Integer> a, int k, int x) {
        // write code here
        for(int i = 0;i<k;i++)
        {
            Collections.sort(a);
            int max = a.get(a.size()-1);
            a.set(a.size()-1,max-x);
        }
        Collections.sort(a);
        return a.get(a.size()-1);
    }
}
