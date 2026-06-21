## [Maximum Sub Array](https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1)

```
// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int sum=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>-1){
                temp.add(arr[i]);
                sum+=arr[i];
            }
            else{
                if(max<sum||(max==sum && temp.size()>ans.size())){
                    max=sum;
                    ans.clear();
                    ans.addAll(temp);
                }
                sum=0;
                temp.clear();
            }
            
        }
        if(max<sum||(max==sum && temp.size()>ans.size())){
            ans.clear();
            ans.addAll(temp);
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
        
    }
}
