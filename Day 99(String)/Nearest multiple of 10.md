## [Nearest multiple of 10](https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1)
```
// User function Template for Java

class Solution {

    String roundToNearest(String s) {
        // Complete the function
        StringBuilder ans = new StringBuilder(s);
        int n=ans.length();
        int last=ans.charAt(n-1)-'0';
        
        if(last<=5){
            ans.setCharAt(n-1,'0');
            return ans.toString();
        }
        int i=n-2;
        int carry=1;
        ans.setCharAt(n-1,'0');
        while(i>=0 && carry>0){
            int value = (ans.charAt(i)-'0')+1;
            carry=value/10;
            int digit = value%10;
            ans.setCharAt(i,(char)(digit+'0'));
            i--;
        }
        if(carry>0){
            ans.insert(0,'1');
        }
           
        return ans.toString();
    }
}
