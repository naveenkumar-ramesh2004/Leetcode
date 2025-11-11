## [Implement Upper Bound](https://www.geeksforgeeks.org/problems/implement-upper-bound/1)

```
class Solution {
    int upperBound(int[] arr, int target) {
        return Upperbound(arr,target);
        
    }
        int Upperbound(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                 start = mid+1;
            }
        }
        return start;
    }
}
