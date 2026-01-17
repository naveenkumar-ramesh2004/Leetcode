## [Array Duplicates](https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1)
```
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        // HashSet<Integer> temp = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int val=Math.abs(arr[i])-1;
            arr[val]=-1*arr[val];
        }
        for(int i=0;i<arr.length;i++){
            int val=Math.abs(arr[i])-1;
            if(arr[val]>0){
                ans.add(Math.abs(arr[i]));
                arr[val]=-1*arr[val];
            }
        }
        
        return ans;
    }
}
