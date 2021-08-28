package offer17;

public class Solution {
    public int[] printNumbers(int n) {
        int maxnumber = 9;
        while(--n>0) maxnumber = maxnumber*10+9;
        int [] res = new int[maxnumber];
        for(int i=1;i<=maxnumber;i++)
        {
            res[i-1] =i;
        }
        return res;
    }
}
