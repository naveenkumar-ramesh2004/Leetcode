## [Number of occurrence](https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1) 

```
class Solution {
    int countFreq(int[] arr, int target) {
        int start=Bs(arr,target,true);
        if(start<0){return 0;}
        int end =Bs(arr,target,false);
        return end-start+1;
    }
    int Bs(int arr[],int target,boolean left){
        int low=0;
        int high=arr.length-1;
        int pos=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                pos = mid;
                if(left){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return pos;
    }
}
