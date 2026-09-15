## [Linked List Insertion At Beginning](https://www.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1)
```
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
}
