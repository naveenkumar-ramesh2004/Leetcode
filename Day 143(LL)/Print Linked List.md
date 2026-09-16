## [Print Linked List](https://www.geeksforgeeks.org/problems/print-linked-list-elements/1)

```
/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(head==null) return result;
        Node temp=head;
        while(temp!=null){
            result.add(temp.data);
            temp=temp.next;
        }
        return result;
    }
}
