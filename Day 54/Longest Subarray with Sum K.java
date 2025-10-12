// Longest Subarray with Sum K
// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1


// // User function Template for Java

// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         // code here
//         int sum=0,count=1;
//         int max=0;
//         for(int i=0;i<arr.length;i++){
//              sum=0;
//             count=0;
//             for(int j=i;j<arr.length;j++){
//                     sum+=arr[j];
//                     count++;
//                     if(sum==k){
//                   max=Math.max(max,count);
//             }
            
            
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum=0,lengthsubarray=0;
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                lengthsubarray=Math.max(lengthsubarray,i+1);
            }
            if(hash.containsKey(sum-k)){
                lengthsubarray=Math.max(lengthsubarray,i-hash.get(sum-k));
            }
            if(!hash.containsKey(sum)){
            hash.put(sum,i);
            }
        }
        return lengthsubarray;
          
    }
}
