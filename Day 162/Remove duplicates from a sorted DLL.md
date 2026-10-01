## [Remove duplicates from a sorted DLL](https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1)

```
/* Structure of a link list node
class Node {
	int data; // value stored in node
	Node next;
	Node prev;
	
	Node(int value) {
		data = value;
		next = null;
		prev = null;
	}
}
*/
class Solution {
	Node removeDuplicates(Node head) {
		// code here
		Node curr = head;
		while (curr != null) {
			Node temp = curr.next;
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			if (temp != null)
				temp.prev = curr;
			else
				return head;
			curr = curr.next;
		}
		return head;
	}
}
