## [Sum of Middle elements of two sorted arrays](https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1)
```
class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                int idx=0;
                while(idx<arr2.length-1 && arr2[idx]>arr2[idx+1]){
                    int t=arr2[idx];
                    arr2[idx]=arr2[idx+1];
                    arr2[idx+1]=t;
                    idx++;
                }
            }
        }
        return arr1[arr1.length-1]+arr2[0];
    }
}
