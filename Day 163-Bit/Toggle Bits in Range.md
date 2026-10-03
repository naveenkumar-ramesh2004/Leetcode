## [Toggle Bits in Range](https://www.geeksforgeeks.org/problems/toggle-bits-given-range0952/1)
```
class Solution {
    public int toggleBits(int n, int l, int r) {
        // code here
        int mask =((1<<(r-l+1))-1)<<(l-1);
        return n^mask;
        
    }
};
