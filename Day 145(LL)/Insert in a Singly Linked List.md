## [Insert in a Singly Linked List](https://www.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1)

```
/* Structure of Linked List Node
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
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node addNewNode= new Node(val);
        if(pos==1) {
            addNewNode.next=head;
            return addNewNode;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==pos){
                addNewNode.next=temp;
                prev.next=addNewNode;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=addNewNode;
        return head;
        
    }
}
