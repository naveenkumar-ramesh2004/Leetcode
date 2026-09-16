## [Doubly Linked List Traversal](https://www.geeksforgeeks.org/problems/display-doubly-linked-list--154650/1)
```
/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        if(head==null) return result;
        Node temp=head;
        List<Integer> forward = new ArrayList<>();
        
        
        while(temp!=null){
            forward.add(temp.data);
            temp=temp.next;
        }
        result.add(forward);
        
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        List<Integer> backward = new ArrayList<>();
        while(temp!=null){
            backward.add(temp.data);
            temp=temp.prev;
        }
        
        result.add(backward);
        return result;
        
        
        
    }
}
