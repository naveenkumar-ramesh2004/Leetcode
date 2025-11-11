## [Implement Lower Bound](https://www.geeksforgeeks.org/problems/implement-lower-bound/0)


```

class Solution {
    int lowerBound(int[] arr, int target) {
        return lowerbound(arr,target);
        
    }
     int lowerbound(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                 start = mid+1;
            }
        }
        return start;
    }

}
