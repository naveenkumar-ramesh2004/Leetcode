## [Sort a linked list of 0s, 1s and 2s](https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1)

```
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zerohead=null;
        Node zerotail=null;
        Node onehead=null;
        Node onetail=null;
        Node twohead=null;
        Node twotail=null;
        
        Node curr =head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=null;
            
            if(curr.data==0){
                if(zerohead==null) zerohead=curr;
                else zerotail.next=curr;
                zerotail=curr;
            }
            else if(curr.data==1){
                if(onehead==null) onehead=curr;
                else onetail.next=curr;
                onetail=curr;
            }
            else{
                if(twohead==null) twohead=curr;
                else twotail.next=curr;
                twotail=curr;
            }
            curr=next;
        }
        
        if(zerohead!=null){
            if(onehead!=null){
                zerotail.next=onehead;
                onetail.next=twohead;
            }
            else{
                zerotail.next=twohead;
            }
            return zerohead;
        }
        else if(onehead!=null){
            onetail.next=twohead;
            return onehead;
        }
        return twohead;
    }
}
