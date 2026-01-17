## [Buildings receiving sunlight](https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1)

```
// User function Template for Java

class Solution {

    public static int longest(int arr[]) {
        // write code here
        int max=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}
