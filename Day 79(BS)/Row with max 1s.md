## [Row with max 1s](https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1)

```
class Solution {
    public int rowWithMax1s(int mat[][]) {
        // code here
        int maxcount=0;
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            int idx=lowerbound(mat[i],1);
            if(idx!=-1){
            int count=mat[i].length-idx;
            if(count>maxcount){
                ans=i;
                maxcount=count;
            }
            }
        }
        return ans;
    }
    public int lowerbound(int[] arr,int x){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=x){
                end=mid-1;
                ans=mid;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
