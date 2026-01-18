## [Array Leaders](https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1)
```
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr[arr.length-1]);
        int idx=0;
        for(int i=arr.length-2;i>=0;i--){
            if(ans.get(idx)<=arr[i]){
                ans.add(arr[i]);
                idx++;
            }
        }
        int low =0;
        int high= ans.size()-1;
        while(low < high){
            int temp =ans.get(low);
            ans.set(low,ans.get(high));
            ans.set(high,temp);
            low++;
            high--;
        }
        return ans;
    }
}
