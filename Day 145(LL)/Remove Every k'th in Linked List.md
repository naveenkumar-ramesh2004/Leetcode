## [Remove Every k'th in Linked List](https://www.geeksforgeeks.org/problems/remove-every-kth-node/1)

```
/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if(head==null || k==1) return null;
        Node temp = head;
        Node prev=null;
        int count=0;
        while(temp!=null){
            count++;
             if(count==k){
                prev.next=temp.next;
                count=0;
             }
             prev=temp;
             temp=temp.next;
        }
        return head;
    }
}
