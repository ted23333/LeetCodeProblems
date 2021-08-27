package offer13;

public class Solution {

    int m,n,k;

    int cnt=0;
    public static void main(String[] args) {
        int re = new Solution().movingCount(1,2,1);
    }
    public int movingCount(int m, int n, int k) {
       // 规定搜索方向，向右或者向下
        this.m = m;
        this.n = n;
        this.k = k;
        boolean judge[][] = new boolean[m][n];

          dfs(0,0,judge);
          return cnt;
    }
    public  void  dfs(int x,int y,boolean judge[][])
    {
        if(x>m-1||y>n-1||judge[x][y]==true||numberCount(x)+numberCount(y)>k) return;
        judge[x][y] = true;
        cnt++;
        dfs(x,y+1,judge);
        dfs(x+1,y,judge);

    }
    public int numberCount(int number)
    {
        int res = 0;
        while(number!=0)
        {
            res += number%10;
            number /=10;
        }
    return res;
    }

}
