## [Is Linked List Length Even](https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1)

```
/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        Node temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return (length%2==0)?true:false;
    }
}
