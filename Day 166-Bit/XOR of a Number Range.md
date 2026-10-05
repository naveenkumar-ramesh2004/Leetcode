## [XOR of a Number Range](https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1)

```
class Solution {
    public static int findXOR(int l, int r) {
        // code here
        return (xor(l-1)^xor(r));
    }
    public static int xor(int n){
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
}
