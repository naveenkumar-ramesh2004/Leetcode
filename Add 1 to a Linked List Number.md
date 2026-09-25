## [Add 1 to a Linked List Number](https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)

```
/* Structure of linked list Node
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
    public Node addOne(Node head) {
        // code here.
        Node curr=reverse(head);
        
        Node result=null;
        int carry=1;
        
        while(curr!=null || carry!=0){
            int x=(curr!=null)?curr.data:0;
            int sum=carry+x;
            Node temp = new Node(sum%10);
            temp.next=result;
            result=temp;
            carry=sum/10;
            curr=(curr!=null)?curr.next:null;
        }
        return result;
        
    }
    public Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
