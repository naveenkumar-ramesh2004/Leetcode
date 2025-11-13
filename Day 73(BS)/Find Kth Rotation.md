## [Find Kth Rotation](https://www.geeksforgeeks.org/problems/rotation4723/1)

```
class Solution {
    public int findKRotation(int arr[]) {
        
        return (findPeak(arr)+1)%arr.length;
        
    }
    static int findPeak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
            else{
                 end=mid-1;
            }
        }
        return -1;
    }
    
}
