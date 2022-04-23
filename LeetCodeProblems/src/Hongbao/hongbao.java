package Hongbao;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;

public class hongbao {
    public static void main(String[] args) {
        int n = 3;
        double m = 6.66;
        double []res = generate(n,m);
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i=0;i<n;i++)
        {
            System.out.println(df.format(res[i]));
        }
    }
    public static double [] generate(int n,double m)
    {
       // 假设两个包及其以上
        double [] res = new double[n];
        double currentsum = m;
        for(int i = 0;i<n-1;i++)
        {
            double avg = currentsum/(n-i); // 每次剩余的平均金额
            double ran = Math.random(); // 返回[0,1)的随机数
            double money = (2*avg-0.01)*ran+0.01;
            res[i] = money;
            currentsum -=money;
        }
        res[n-1] = currentsum;


        // Collections.shuffle(Arrays.asList(res));

      return res;
    }
}
