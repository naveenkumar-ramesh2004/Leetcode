## [Count Subarrays with given XOR](https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1)

```
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int xr=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            if(map.containsKey(xr^k)){
                count+=map.get(xr^k);
            }
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return count;
    }
}
