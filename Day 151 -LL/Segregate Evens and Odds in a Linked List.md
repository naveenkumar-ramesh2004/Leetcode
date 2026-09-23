## [Segregate Evens and Odds in a Linked List](https://www.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1)

```
/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node oddhead=null;
        Node oddtail=null;
        Node evenhead=null;
        Node eventail=null;
        Node curr=head;
        while(curr!=null){
            
            Node next=curr.next;
            curr.next=null;
            
            if(curr.data%2==0){
                if(evenhead==null) {
                    evenhead=curr;
                }
                else{
                    eventail.next=curr;
                }
                eventail=curr;
                
            }
            else{
                if(oddhead==null){
                    oddhead=curr;
                }
                else{
                    oddtail.next=curr;
                }
                oddtail=curr;
            }
            curr=next;
        }
        
        if(eventail!=null) {
            eventail.next=oddhead;
            return evenhead;
        }
        return oddhead;
    }
}
