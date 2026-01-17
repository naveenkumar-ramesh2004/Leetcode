## [Array Subset](https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)

```

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : a)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for(int val:b){
            map.put(val,map.getOrDefault(val,0)-1);
            if(map.get(val)<0){
                return false;
            }
        }
        return true;
    }
}
