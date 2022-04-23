package Meituan4;


import java.util.*;

public class Main {
    static class DualHeap{
        private PriorityQueue<Integer> small;
        private PriorityQueue<Integer> large;
        private Map<Integer,Integer> delayed;
        private int k;
        private int smallSize,largerSize;
        public DualHeap(int k){
            this.small = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            this.large = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            this.delayed = new HashMap<Integer,Integer>();
            this.k = k;
            this.smallSize = 0;
            this.largerSize = 0;
        }
        public int getMedian()
        {
            return (k&1)==1?small.peek():(small.peek()+large.peek())/2;
        }
        public void erase(int num){
         delayed.put(num,delayed.getOrDefault(num,0)+1);
         if(num<=small.peek())
         {
             --smallSize;
             if(num==small.peek())
             {
                 prune(small);
             }
         }
         else{
             --largerSize;
             if(num == large.peek())
             {
                 prune(large);
             }
         }
         makeBalance();
        }
        public void insert(int num)
        {
            if(small.isEmpty()||num<=small.peek()){
                small.offer(num);
                ++smallSize;
            }
            else{
                large.offer(num);
                ++largerSize;
            }
            makeBalance();
        }
        private void prune(PriorityQueue<Integer> heap)
        {
            while(!heap.isEmpty())
            {
                int num = heap.peek();
                if(delayed.containsKey(num)){
                    delayed.put(num,delayed.get(num));
                    if(delayed.get(num)==0)
                    {
                        delayed.remove(num);
                    }
                    heap.poll();
                }
                else {
                    break;
                }
            }
        }
        private void makeBalance()
        {
            if(smallSize>largerSize+1)
            {
                large.offer(small.poll());
                --smallSize;
                ++largerSize;
                prune(large);
            }
            else if(smallSize<largerSize)
            {
                small.offer(large.poll());
                ++smallSize;
                --largerSize;
                prune(large);
            }
        }

    }
    public static int[] medianSlidingWindow(int[]nums,int k)
    {
        DualHeap dh = new DualHeap(k);
        for(int i = 0;i<k;++i)
        {
            dh.insert(nums[i]);
        }
        int []ans = new int[nums.length-k+1];
        ans[0]=dh.getMedian();
        for(int i = k;i<nums.length;++i)
        {
            dh.insert(nums[i]);
            dh.erase(nums[i-k]);
            ans[i-k+1] = dh.getMedian();
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0;i<n;i++)
            sum += nums[i];
        int len = 3;
       while(len<=n)
        {
            int res[] = medianSlidingWindow(nums,len);
            for(int i:res)
            {
                sum +=i;
            }
        len  = len+2;
        }
        System.out.println(sum);
    }

}
