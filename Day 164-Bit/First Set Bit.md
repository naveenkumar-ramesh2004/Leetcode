## [First Set Bit](https://www.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1)
```
class Solution {
    public static int getFirstSetBit(int n) {
        // code here
        int pos=0;
        while(n!=0){
            if((n&1)==1) return pos+1;
            n=n>>1;
            pos++;
        }
        return pos+1;
    }
}
