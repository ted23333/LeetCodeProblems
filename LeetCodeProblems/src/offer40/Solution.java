package offer40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
         int []vec = new int[k];
         if(k==0)
             return vec;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 0;i<k;++i)
        {
            queue.offer(arr[i]);
        }
        for(int i =k;i<arr.length;++i)
        {
            if(queue.peek()>arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for(int i=0;i<k;++i)
        {
            vec[i] = queue.poll();
        }
        return vec;

    }
}