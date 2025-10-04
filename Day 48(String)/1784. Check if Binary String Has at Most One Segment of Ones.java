//1784. Check if Binary String Has at Most One Segment of Ones
// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

// if i=0 i+1=1 its false ,otherwise true



// First oproch
//  use leftone and rightone 
            //if leftone =ture  zero=ture rightone=tue it mean 101 it false
            // optimize we won't check left one only check if 0 after 1 so zer0 =true rightone =true then 01 mean false


// class Solution {
//     public boolean checkOnesSegment(String s) {
//        boolean leftone=false;
//        boolean rightone=false;
//        boolean zero=false;
//        for(char c:s.toCharArray()){
//         if(c=='1'){
//             if(!leftone){
//                 leftone=true;
//             }
//             else if(zero){
//                 rightone=true;
//             }
//         }
//         else{
//             zero=true;
//         }
//        }
//        return (leftone && rightone && zero)?false:true;
//     }
// }

//second approach
//check '01' mean false ,otherwise true

class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                return false;
            }
        }
        return true;
    }
}

