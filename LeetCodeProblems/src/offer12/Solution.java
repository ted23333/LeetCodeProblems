package offer12;

class Solution {
    boolean[][] judge;
    StringBuilder res;
    int len;
    String word;
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        len = word.length();
        judge = new boolean[row][col];
        this.word = word;
        for(int i = 0;i <= row - 1;++i){
            for(int j = 0;j <= col - 1;++j){
                if(recall(board,i,j,0)) return true;
            }
        }
        return false;
    }
    boolean recall(char[][] board, int i,int j,int k){
        if(i < 0 || i >= judge.length || j < 0 || j >= judge[0].length || judge[i][j] || board[i][j] != word.charAt(k)){
            return false;
        }
        if(k == len - 1) return true;
        judge[i][j] = true;
        boolean temp = recall(board,i+1,j,k+1) || recall(board,i,j+1,k+1) || recall(board,i-1,j,k+1) || recall(board,i,j-1,k+1);
        judge[i][j] = false;
        return temp;
    }
}

