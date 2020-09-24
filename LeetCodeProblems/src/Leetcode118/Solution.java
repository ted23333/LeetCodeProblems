package Leetcode118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<List<Integer>> result = new Solution().generate(3);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
            // 如果行数是0的话，就返回一个空的链表
        }

        // Second base case; first row is always [1].
        // 第一行是1,
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // 构建当前行，然后获取上一行的信息
            row.add(1);
            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
                // 这块在第一行生成的时候不会运行 第一行：[1,1]
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}

