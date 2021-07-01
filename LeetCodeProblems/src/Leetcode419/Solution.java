package Leetcode419;
// 甲板上的战舰
class Solution {
    // 战舰头的左边和上边一定不是x
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 判断是否是战舰头，要防止越界
                if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    count++;
                }
            }
        }
        return count;
    }
}
