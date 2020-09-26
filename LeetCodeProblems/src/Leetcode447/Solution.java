package Leetcode447;

import java.util.HashMap;
import java.util.Map;

// 447 回旋镖的数量
class Solution {
    public int numberOfBoomerangs(int[][] points) {

        int res = 0;

        //O(n^2)
        // 对于每一个结点，计算该节点和其他结点之间的距离，然后按照距离-key 点的数量-value的方式进行存储
        for(int i = 0; i < points.length;i++){
            Map<Integer, Integer> record = new HashMap<>();
            for(int j = 0; j < points.length; j ++){
                if( j != i )
                    if(record.containsKey(distance(points[i], points[j]))){
                        record.put(distance(points[i], points[j]),
                                record.get(distance(points[i], points[j])) + 1);
                    }
                    else
                        record.put(distance(points[i], points[j]), 1);
            }
            // 对于第i个点，计算其他的点到这个点的距离，然后把距离与点的信息加入到集合里面
            for(int k : record.values()){
                if(k >= 2)//这里其实可以不加这句，因为k=1或k=0，结果都是0，但是加上可以减少一定的计算量。
                    res += k * (k - 1);
            }

        }

        return res;
    }

    private int distance(int[] x, int[] y){
        // 计算距离的平方
        return (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
    }
}


