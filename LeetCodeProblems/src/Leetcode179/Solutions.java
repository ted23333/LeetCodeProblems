package Leetcode179;

import java.util.PriorityQueue;

// 使用自定义排序和优先队列的方式来实现
class Solutions {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        int t = (a+b).compareTo(b+a);
        System.out.println(t);
    }
    public String largestNumber(int[] nums) {
        // 自定义比较器
        PriorityQueue<String> heap = new PriorityQueue<>((x, y) -> (y + x).compareTo(x + y));
        // 自定义比较器降序排列
        for(int x: nums) heap.offer(String.valueOf(x));
        String res = "";
        while(heap.size() > 0) res += heap.poll();
        if(res.charAt(0) == '0') return "0";
        return res;
    }
}
