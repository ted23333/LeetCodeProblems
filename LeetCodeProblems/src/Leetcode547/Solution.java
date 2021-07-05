package Leetcode547;
// 省份数量
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];
        // 设定一个人数组看哪个城市没有被访问过
        int circles = 0;
        // 返回连通分量的个数
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                // 如果该城市没有被访问过，从这个城市开始深搜
                dfs(isConnected, visited, provinces, i);
                circles++;
            }
        }
        return circles;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int provinces, int i) {
        for (int j = 0; j < provinces; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, provinces, j);
            }
        }
    }
}
