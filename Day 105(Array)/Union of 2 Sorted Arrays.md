## [Union of 2 Sorted Arrays](https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1)
``` 
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> arr = new TreeSet<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int val:a){
            arr.add(val);
        }
        for(int val:b){
            arr.add(val);
        }
        ans.addAll(arr);
        return ans;

    }
}

