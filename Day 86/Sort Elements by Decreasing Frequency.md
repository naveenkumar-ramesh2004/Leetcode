## [Sort Elements by Decreasing Frequency](https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1)
```

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int val:arr){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }
        return sort(freq);
    }
    ArrayList<Integer> sort(HashMap<Integer,Integer> freq){
        ArrayList<Integer> keysort = new ArrayList<>(freq.keySet());
        Collections.sort(keysort,(a,b)->{
            int x=freq.get(a);
            int y=freq.get(b);
            if(x==y){
                return a-b;
            }
            else{
                return y-x;
            }
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:keysort){
            for(int j=0;j<freq.get(i);j++){
                ans.add(i);
            }
        }
        return ans;
    }
}
