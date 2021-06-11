package Leetcode174;
// 地下城游戏
// 因为这里有两个同样重要的因素，所以不能用这种思路dp
public class Solution {

    public int calculateMinimumHP(int[][] dungeon) {
       int M = dungeon.length;
       int N = dungeon[0].length;
       if(M==0||N==0) return 1;
       int [][]currentBlood = new int[M][N];
       int [][]leastBlood = new int [M][N];
       // currentBlood 记录当前的血量
        // leastBlood 记录达到的最低血量
        currentBlood[0][0] = dungeon[0][0];
        leastBlood[0][0] = dungeon[0][0];
        for(int row=1;row<M;row++)
        {
            currentBlood[row][0] = currentBlood[row-1][0]+dungeon[row][0];
            leastBlood[row][0] = Math.min(leastBlood[row-1][0],currentBlood[row-1][0]);
        }
        for(int column =1;column<N;column++)
        {
            currentBlood[0][column] = currentBlood[0][column-1]+dungeon[0][column];
            leastBlood[0][column] = Math.min(leastBlood[0][column-1],currentBlood[0][column]);
        }
        if(M==1||N==1) return leastBlood[M-1][N-1]>=0?1:-leastBlood[M-1][N-1]+1;
        // 只有单个行列的情况
        for(int i =2;i<M;i++)
        {
            for(int j = 2;j<N;j++)
            {
                currentBlood[i][j] = Math.max(currentBlood[i-1][j],currentBlood[i][j-1])+dungeon[i][j];

                leastBlood[i][j] = Math.min(Math.max(leastBlood[i-1][j],leastBlood[i][j-1]),currentBlood[i][j]);
            }
        }
        return  leastBlood[M-1][N-1]>=0?1:-leastBlood[M-1][N-1]+1;
    }
}
