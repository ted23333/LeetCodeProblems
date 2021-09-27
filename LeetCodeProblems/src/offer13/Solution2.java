package offer13;

public class Solution2 {
    // 必须用搜索的方式来做，这样做是不可以的，算出来的总数会多一些
    public static void main(String[] args) {
        int c = new Solution2().movingCount(16,8,4);
    }
    public int movingCount(int m, int n, int k) {
        int count = 0;
       for(int i = 0;i<m;i++){
           if(cal(i)>k) break;
           for(int j = 0;j<n;j++)
           {
               if(cal(i)+cal(j)<=k)
                   count++;
               else break;
           }}
       return count;
    }
    private int  cal(int i)
    {
        int sum = 0;
        while(i>0)
        {
            sum += i%10;
            i = i/10;
        }
        return sum;
    }
}
