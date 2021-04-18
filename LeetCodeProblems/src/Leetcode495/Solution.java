package Leetcode495;
// 提莫攻击
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
      int attack_times = timeSeries.length;
      if(attack_times==0) return 0;
      int sum = 0;
      for(int i = 0;i<attack_times-1;i++)
      {
          if(timeSeries[i+1]-timeSeries[i]>=duration) sum += duration;
          // 如果两次攻击时间间隔大于中毒状态，那总中毒时间等于中毒时间
        else sum += timeSeries[i+1]-timeSeries[i];
      }
      sum +=duration;

      return sum;
    }
}
