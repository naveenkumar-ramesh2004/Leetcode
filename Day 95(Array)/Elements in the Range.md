## [Elements in the Range](https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1)

```
// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        boolean[] occur = new boolean[(B-A)+1];
        for(int val:arr){
            if(val>=A && val<=B){
            occur[val-A]=true;
            }
        }
        for(boolean f:occur){
            if(!f){
                return false;
            }
        }
        return true;
    }
}
