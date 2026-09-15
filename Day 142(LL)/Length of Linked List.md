## [Length of Linked List](https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1)
```
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        if(head==null) return 0;
        int length=1;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        return length;
        
    }
}
