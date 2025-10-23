// 3461. Check If Digits Are Equal in String After Operations I
// https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23



class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>2){
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<sb.length()-1;i++){
                temp.append(
                    (sb.charAt(i)-'0'+sb.charAt(i+1)-'0')%10
                    );
            }
            sb=temp;
        }
        
        return sb.charAt(0)==sb.charAt(1);
    }
}
