package Leetcode451;

import java.util.PriorityQueue;
// 451 根据字符出现的次序排队
// 加入优先队列 优先队列中，元素赋予优先级，当访问元素的时候，具有最高优先级的元素先被删除
// 这个写法要能看懂，基于堆排序
// 然后将字符串拼接起来
class Solution {
    public String frequencySort(String s) {
        //初始化字母数组
        int[] latters = new int[256];
        //填充数组
        for(char c:s.toCharArray()){
            latters[c]++;
        }
        //排序
        PriorityQueue<Latter> queue = new PriorityQueue<>();

        for (int i = 0;i<latters.length;i++){
            if (latters[i]!=0){
                queue.add(new Latter((char) i,latters[i]));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()){
            Latter latter = queue.poll();
            for (int i =0;i<latter.count;i++)
                stringBuilder.append(latter.latter);
        }


        return stringBuilder.toString();
    }

    public class Latter implements Comparable<Latter>{
        public char latter = '0';
        public int count = 0;

        public Latter(char latter, int count) {
            this.latter = latter;
            this.count = count;
        }

        @Override
        public int compareTo(Latter o) {
            return o.count - this.count;
        }
    }
}