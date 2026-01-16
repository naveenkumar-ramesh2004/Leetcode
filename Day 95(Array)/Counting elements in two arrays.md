## [Counting elements in two arrays](https://www.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1)

```
class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        int n=0;
        for(int val:b){
            n=Math.max(val,n);
        }
        int freq[]=new int[n+1];
        for(int val:b){
            freq[val]++;
            
        }
        for(int i=1;i<=n;i++){
            freq[i]+=freq[i-1];
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int val:a){
            if(n>=val) ans.add(freq[val]);
            else ans.add(b.length);
        }
        return ans;
        
    }
}
