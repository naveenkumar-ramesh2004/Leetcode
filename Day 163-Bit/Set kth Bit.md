## [Set kth Bit](https://www.geeksforgeeks.org/problems/set-kth-bit3724/1)

```
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return (1<<k)|n;
    }
}
