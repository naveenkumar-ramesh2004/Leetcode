## [Longest Subarray with Sum K](https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1)

```
// User function Template for Java brute fore O(n^2) 

// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         // code here
//         int max=0;
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=i;j<arr.length;j++){
//                 sum+=arr[j];
//                 if(sum==k){
//                     max=Math.max(max,j-i+1);
//                 }
//             }
//         }
//         return max;
//     }
// }

```
---
optimal T=O(n) S=O(n)
```
class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum=0;
        int maxlength=0;
        map.put(0,0);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                maxlength=Math.max(maxlength,(i-map.get(sum-k)+1));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i+1);
            }
        }
        return maxlength;
        
    }
}
