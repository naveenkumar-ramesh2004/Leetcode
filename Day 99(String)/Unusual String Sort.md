## [Unusual String Sort](https://www.geeksforgeeks.org/problems/unusual-string-sort0405/1)
```
// User function Template for Java

class Sol {
    public static String stringSort(String s) {
        // your code here
        int[] small = new int[26];
        int[] capital = new int[26];
        StringBuilder S = new StringBuilder();
        StringBuilder C = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                small[c-'a']++;
            }
            else{
                capital[c-'A']++;
            }
        }
        int sidx=0;
        int cidx=0;
        while(sidx<26){
            while (sidx < 26 && small[sidx] == 0) sidx++;
            if (sidx == 26) break;
            for(int j=0;j<small[sidx];j++){
                S.append((char)(sidx+'a'));
            }
            sidx++;
        }
        while(cidx<26){
            while (cidx < 26 && capital[cidx] == 0) cidx++;
            if (cidx == 26) break;
            for(int j=0;j<capital[cidx];j++){
                C.append((char)(cidx+'A'));
            }
            cidx++;
        }
        sidx=0;
        cidx=0;
        while(sidx<S.length() && cidx<C.length()){
            ans.append(C.charAt(cidx++)).append(S.charAt(sidx++));
        }
        while(sidx<S.length()){
            ans.append(S.charAt(sidx++));
        }
        while(cidx<C.length()){
            ans.append(C.charAt(cidx++));
        }
        return ans.toString();
    }
}
