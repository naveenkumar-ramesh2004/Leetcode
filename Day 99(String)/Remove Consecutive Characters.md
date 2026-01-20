## [Remove Consecutive Characters](https://www.geeksforgeeks.org/problems/consecutive-elements2306/1)
```
// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int idx=0;
        for(char c:s.toCharArray()){
            if(ans.charAt(idx)!=c){
                ans.append(c);
                idx++;
            }
        }
        return ans.toString();
    }
}
