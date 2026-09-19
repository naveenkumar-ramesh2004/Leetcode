## [Insertion in a Doubly Linked List](https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1)
```
/* Structure of Doubly Linked List Node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
		this.data = data;
		next = prev = null;
	}
}
*/

class Solution {
	Node insertAtPos(Node head, int p, int x) {
		// code here
		Node addAtPos = new Node(x);
		if (head == null)
			return addAtPos;
		Node temp = head;
		int count = 0;
		while (temp!= null) {
			if (count == p) {
				addAtPos.next = temp.next;
				temp.next = addAtPos;
				addAtPos.prev = temp;
				return head;
			}
			count++;
			temp = temp.next;
		}
		addAtPos.next = temp.next;
		temp.next = addAtPos;
		addAtPos.prev = temp;
		return head;
	}
}
