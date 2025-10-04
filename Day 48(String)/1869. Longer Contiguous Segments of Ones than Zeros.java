//1869. Longer Contiguous Segments of Ones than Zeros
//https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/description/


// class Solution {
//     public boolean checkZeroOnes(String s) {
//         if(s.length()==1){return (s.charAt(0)=='0')?false:true;}
//         int onemax=1;
//         int zeromax=1;
//         int count=1;
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i)==s.charAt(i+1)){
//                 count++;
//                 if(s.charAt(i)=='0' && zeromax<count){
//                     zeromax=count;

//                 }
//                 else{
//                     if(onemax<count){
//                         onemax=count;
//                     }
//                 }
//             }
//             else{
//                 count =1;
//             }
//         }
//         return (zeromax<onemax)?true:false;
//     }
// }

//Optimize Way

class Solution {
    public boolean checkZeroOnes(String s) {
        int onemax=0;
        int zeromax=0;
        int onecount=0;
        int zerocount=0;
        for(char c:s.toCharArray()){
           if(c=='1'){
            onecount++;
            onemax=Math.max(onemax,onecount);
            zerocount=0;
           }
           else{
            zerocount++;
            zeromax=Math.max(zeromax,zerocount);
            onecount=0;
           }
        }
        return zeromax<onemax;
    }
}
