## [Floor in a Sorted Array](https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1)

```

class Solution {
    public int findFloor(int[] arr, int x) {
        return floor(arr,x);
    }
        int floor(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        int pos=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                pos =mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return pos;
    }
}
