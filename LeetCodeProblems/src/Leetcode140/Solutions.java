package Leetcode140;

import java.util.*;
// 回溯的方法解决
class Solutions {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        List<String> ans = new ArrayList<>();
        dfs(s, ans, 0, new LinkedList<>(), set);
        return ans;
    }

    public void dfs(String s, List<String> ans, int idx, Deque<String> path, Set<String> set) {
        if (idx == s.length()) {
            ans.add(String.join(" ", path));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i + 1);
            if (set.contains(str)) {
                path.add(str);
                dfs(s, ans, i + 1, path, set);
                path.removeLast();
            }
        }
    }
}
