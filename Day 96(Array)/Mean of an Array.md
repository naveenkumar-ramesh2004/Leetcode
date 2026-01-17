## [Mean of an Array](https://www.geeksforgeeks.org/problems/mean0021/1)

```
class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        return sum/arr.length;
    }
};
