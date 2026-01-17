## [Adding Array Elements](https://www.geeksforgeeks.org/problems/adding-array-element4756/1)
```
// User function Template for Java

class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        for (int x : arr) {
            temp.offer(x);
        }
        int count=0;
        while(temp.size()>1 && temp.peek()<k){
            temp.add(temp.poll()+temp.poll());
            count++;
        }
        return (temp.peek()>=k)?count:-1;
    }
}
