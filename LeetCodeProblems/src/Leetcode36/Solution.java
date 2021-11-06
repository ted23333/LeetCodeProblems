package Leetcode36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 有效的数独
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row  = new HashMap<>(), col = new HashMap<>(), area = new HashMap<>();
        // 分别判断每一个区域是否满足有效条件
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            area.put(i, new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int u = c - '0';
                int idx = i / 3 * 3 + j / 3;
                // 确定当前的元素在区域中的位置
                if (row.get(i).contains(u) || col.get(j).contains(u) || area.get(idx).contains(u)) return false;
                row.get(i).add(u);
                col.get(j).add(u);
                area.get(idx).add(u);
            }
        }
        return true;
    }



}
