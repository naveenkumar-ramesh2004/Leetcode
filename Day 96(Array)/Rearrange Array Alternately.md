## [Rearrange Array Alternately](https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1)
```
class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int x : arr) {
            temp.add(x);
        }
        int low=0;
        int high=arr.length-1;
        int idx=0;
        while(low<high){
            arr[idx++]=temp.get(high--);
            arr[idx++]=temp.get(low++);
        }
        if(arr.length%2!=0)arr[idx]=temp.get(low);
    }
}
