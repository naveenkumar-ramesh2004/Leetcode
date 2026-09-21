## [Add Number Linked List](https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1)

```
/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null || curr2!=null){
            if(curr1!=null) {
                num1.append(curr1.data);
                curr1=curr1.next;
            }
            if(curr2!=null) {
                num2.append(curr2.data);
                curr2=curr2.next;
            }
        }
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        Node result= new Node(0);

        int carry=0;
        while(len1>=0 || len2>=0 || carry!=0){
            int x=(len1>=0)?num1.charAt(len1)-'0':0;
            int y=(len2>=0)?num2.charAt(len2)-'0':0;
            int sum=x+y+carry;
            Node temp = new Node(sum%10);
            temp.next=result.next;
            result.next=temp;
            carry=sum/10;
            len1--;
            len2--;
        }
        Node ans = result.next;

        while (ans != null && ans.data == 0 && ans.next != null) {
            ans = ans.next;
        }

        return ans;
    }
}
