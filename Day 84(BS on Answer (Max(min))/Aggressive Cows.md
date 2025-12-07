## [Aggressive Cows](https://www.geeksforgeeks.org/problems/aggressive-cows/1)

```

class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=Integer.MAX_VALUE;
        int high=-1;
        for(int val:stalls){
            low=Math.min(low,val);
            high=Math.max(high,val);
        }
        high-=low;
        return minMaxDistance(stalls,k,high);
    }
    static int minMaxDistance(int[] stalls,int cow,int high){
        int low=1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlace(stalls,cow,mid)){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    static boolean canPlace(int[] stalls,int cow,int distace){
        int i=0;
        int j=i+1;
        int cowplaced=1;
        while(j<stalls.length){
            if(stalls[i]+distace<=stalls[j]){
                cowplaced++;
                i=j;
            }
            j++;
        }
        return cowplaced>=cow;
    }
}
