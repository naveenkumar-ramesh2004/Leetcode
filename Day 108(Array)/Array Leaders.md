## [Array Leaders](https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1)

```
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(ans.isEmpty()){
                ans.add(arr[i]);
            }
            else{
                if(ans.get(0)<=arr[i]){
                    ans.add(0,arr[i]);
                }
            }
        }
        return ans;
    }
}
