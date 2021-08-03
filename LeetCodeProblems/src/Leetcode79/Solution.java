package Leetcode79;



public class Solution {
    int m,n;
    char [] word_char;
    boolean [][]visited;
    int max_index;

    public static void main(String[] args) {
        char board[][] = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
      boolean solution = new Solution().exist(board,word);
    }
    public boolean exist(char[][] board, String word) {

        m = board.length;
        n = board[0].length;
        word_char = word.toCharArray();
        visited = new boolean[m][n];
        max_index = word_char.length;
        for(int i =0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word_char[0])
                    if( dfs(board,i,j,0)) return true;

                // 只要搜索到一条路径，那么就返回true
            }
        return false; // 搜索不到路径就返回false
    }
    private boolean dfs(char [][]board,int i,int j,int index){
        visited[i][j] = true;
        if(index == max_index-1 ) return true;
        // 当前所在的搜索位置已经达到匹配字符的最后一个位置，返回true
        // 向上搜索
        boolean b1=false,b2=false,b3=false,b4=false;
        if(i-1>=0&&visited[i-1][j]==false&&board[i-1][j]==word_char[index+1]) b1= dfs(board,i-1,j,index+1);
        // 向下搜索
        if(i+1<m&&visited[i+1][j]==false&&board[i+1][j]==word_char[index+1]) b2 = dfs(board,i+1,j,index+1);

        // 向左搜索
        if(j-1>=0&&visited[i][j-1]==false&&board[i][j-1]==word_char[index+1]) b3 = dfs(board,i,j-1,index+1);
        // 向右搜索
        if(j+1<n&&visited[i][j+1]==false&&board[i][j+1]==word_char[index+1])  b4 = dfs(board,i,j+1,index+1);
        // 无从搜索，返回false；
        visited[i][j] = false;
        // 检索完了要返回
        return b1||b2||b3||b4;

    }

}

