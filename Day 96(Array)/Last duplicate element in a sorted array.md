## [Last duplicate element in a sorted array](https://www.geeksforgeeks.org/problems/last-duplicate-element-in-a-sorted-array5539/1)
```
class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                return new int[]{i+1,arr[i]};
            }
        }
        return new int[]{-1,-1};
    }
}
