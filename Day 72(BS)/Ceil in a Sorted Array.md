## [Ceil in a Sorted Array](https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1)

```
// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        return ceil(arr,x);
    }
    int ceil(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        int pos=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                pos =mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return pos;
    }
}
