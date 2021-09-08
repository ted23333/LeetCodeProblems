package offer43;

class Solution {
    // 根据当前位cur的值分为三种情况
    // 若cur=0 此位1的出现次数只由高位high决定 high*digit
    // 若cur=1 此时1的出现次数由高位和低位low决定 high×digit+low+1
    //当cur=2到9 1 的出现次数只由高位决定（high+1）×digit
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}

