## [Search in Linked List](https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1)

```
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head==null) return false;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
}
