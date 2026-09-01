## [Count Substrings with a, b and c](https://www.geeksforgeeks.org/problems/count-substring/1)

```
class Solution {
    public static int countSubstring(String s) {
        // code here
        int count=0;
        int i=0,j=0;
        int hash[] = new int[3];
        while(j<s.length()){
            while(j<s.length() && (hash[0]<1 || hash[1]<1 || hash[2]<1)){
                hash[s.charAt(j)-'a']++;
                j++;
            }
            while(hash[0]>=1 && hash[1]>=1 && hash[2]>=1){
                count+=s.length()-j+1;
                hash[s.charAt(i)-'a']--;
                i++;
            }
        }
        return count;
    }
}
