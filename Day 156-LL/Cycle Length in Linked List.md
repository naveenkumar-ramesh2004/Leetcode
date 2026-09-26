## [Cycle Length in Linked List](https://www.geeksforgeeks.org/problems/find-length-of-loop/1)

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
    public int lengthOfLoop(Node head) {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    Node curr=slow.next;
                    int len=1;
                    while(slow!=curr){
                       curr=curr.next;
                       len++;
                    }
                    return len;
                }
            }
            return 0;
        }
}
