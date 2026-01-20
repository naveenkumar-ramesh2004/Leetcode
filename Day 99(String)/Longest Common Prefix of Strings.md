## [Longest Common Prefix of Strings](https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1)
```
// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String min=arr[0];
        for(String w:arr){
            if(min.length()>w.length()){
                min=w;
            }
        }
        int idx=min.length();
        while(idx>=0){
            boolean flag=true;
            for(String w:arr){
                if(!min.substring(0,idx).contains(w.substring(0,idx))){
                    flag=false;
                    break;
                }
            }
            if(flag)return min.substring(0,idx);
            idx--;
        }
        return "";
    }
}
