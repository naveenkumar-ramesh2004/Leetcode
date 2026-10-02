## [Pair Sum in Sorted Doubly Linked List](https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1)
```
/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

// class Solution {
//     public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
//         // code here
//         HashSet<Integer> seen = new HashSet<>();
//         ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
//         Node curr=head;
//         while(curr!=null){
//             if(seen.contains(target-curr.data)){
//                 ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(target-curr.data,curr.data));;
//                 ans.add(temp);
//             }
//             else{
//                 seen.add(curr.data);
//             }
//             curr=curr.next;
//         }
//         ans.sort((a,b)->{
//             return Integer.compare(a.get(0),b.get(0));
//         });
//         return ans;
//     }
// }


class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        Node left=head;
        Node right=head;
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        while(right.next!=null){
            right=right.next;
        }
        while(left.data<right.data){
            if(left.data+right.data==target){
                ans.add(new ArrayList<>(Arrays.asList(left.data,right.data)));
                left=left.next;
                right=right.prev;
            }
            else if(left.data+right.data>target){
                right=right.prev;
            }
            else{
                left=left.next;
            }
        }
        return ans;
    }
}
