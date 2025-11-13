## [Find nth root of m](https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1)

```
class Solution {
    public int nthRoot(int n, int m) {
        return findNthRoot(n,m);
    }
    int findNthRoot(int n,int m){
        int start = 0;
        int end = m;
        while(start<=end){
            int value=1;
            int mid = start+(end-start)/2;
            for(int i=1;i<=n;i++){
                value*=mid;
            }
            if(value==m){
                return mid;
            }
            else if(value>m){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return -1;
        
    }
}
