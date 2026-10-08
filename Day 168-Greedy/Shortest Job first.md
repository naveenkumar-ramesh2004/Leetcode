## [Shortest Job first](https://www.geeksforgeeks.org/problems/shortest-job-first/1)
```
class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int totwaite=0,waite=0;
        for(int n:bt){
            totwaite+=waite;
            waite+=n;
        }
        return totwaite/bt.length;
    }
}
