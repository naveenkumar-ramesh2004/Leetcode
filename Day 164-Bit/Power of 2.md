##[Power of 2](https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1)

```
class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        return (n>0 && (n&(n-1))==0);
    }
}
