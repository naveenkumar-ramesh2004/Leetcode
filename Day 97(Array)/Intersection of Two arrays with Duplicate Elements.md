## [Intersection of Two arrays with Duplicate Elements](https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1)
```
class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int val:a){
            freq.put(val,1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int val:b){
            if(freq.containsKey(val) && freq.get(val)>0){
                ans.add(val);
                freq.put(val,0);
                
            }
        }
        return ans;
    }
}
