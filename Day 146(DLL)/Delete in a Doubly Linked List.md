## [Delete in a Doubly Linked List](https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1)
```
/* Structure of a Doubly Linked List Node
class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
}
*/
// class Solution {
// 	public Node delPos(Node head, int x) {
// 		// code here
// 		if (head == null || head.next == null)
// 			return null;
// 		Node temp = head;
// 		int count = 1;
// 		while (temp != null) {
// 			if (count == x) {
// 			    if(x==1){
// 			        head=head.next;
// 			        temp.next.prev=null;
// 			        head.prev=null;
// 			    }
// 			    else if(temp.next==null){
// 			        temp.prev.next=null;
// 			        temp.prev=null;
// 			    }
// 			    else{
// 			        temp.prev.next=temp.next;
// 			        temp.next.prev=temp.prev;
// 			        temp.prev=null;
// 			        temp.next=null;
// 			    }
			    
// 			    return head;
// 			}
// 			count++;
// 			temp=temp.next;
// 		}
// 		return head;
// 	}
// }

class Solution {
	public Node delPos(Node head, int x) {
	    if(head==null) return null;
	    
	    Node temp=head;
	    int count=1;
	    while(temp!=null && count<x){
	        count++;
	        temp=temp.next;
	    }
	    
	    if(temp.prev!=null){
	        temp.prev.next=temp.next;
	    }
	    else{
	        head=head.next;
	    }
	    if(temp.next!=null){
	        temp.next.prev=temp.prev;
	    }
	    temp.prev=null;
	    temp.next=null;
	    return head;
	}
}
