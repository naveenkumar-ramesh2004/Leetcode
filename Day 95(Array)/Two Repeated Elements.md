## [Two Repeated Elements](https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1)

```
class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        // HashSet<Integer> occur = new HashSet<>();
        int idx=0;
        int ans[]=new int[2];
        // for(int val:arr){
        //     if(!occur.add(val)){
        //         ans[idx++]=val;
        //     }
        // }
        for(int val:arr){
            val=Math.abs(val);
            if(arr[val]<0){
                ans[idx++]=val;
            }
            else{
                arr[val]=-arr[val];
            }
        }
        return ans;
    }
}
