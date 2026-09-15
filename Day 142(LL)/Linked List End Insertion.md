## [Linked List End Insertion](https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1)

```
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node addAtEnd = new Node(x);
        
        if(head==null) return addAtEnd;
        
        Node temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=addAtEnd;
        return head;
    }
}
