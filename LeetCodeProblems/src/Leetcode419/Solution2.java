package Leetcode419;
// 寻找战舰头，使用dfs的方法
public class Solution2 {
    int count = 0;
    int m,n;
    public  int countBattleships(char [][]board)
    {
         m = board.length;
         n = board[0].length;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(board[i][j] == 'X') {
                    count++;
                    dfs(board,i,j);}
            }
        }
        return count;
    }
    private void dfs(char [][]board,int i,int j)
    {
        if(i<0||i>=m||j<0||j>=n||board[i][j] !='X') return;
        // 边界条件判断
        board[i][j] = '.';

        dfs(board,i-1,j);
        dfs(board,i+1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);

    }
}
