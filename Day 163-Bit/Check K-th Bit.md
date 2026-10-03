## [Check K-th Bit](https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1)

```
// class CheckBit {
//     static boolean checkKthBit(int n, int k) {
//         // code here
//         int count=0;
//         while(n!=0){
//             int rem=n%2;
//             if(k==count){
//                 return (rem==1)?true:false;
//             }
//             count++;
//             n/=2;
//         }
//         return false;
//     }
// }


// Left shift 
// class CheckBit {
//     static boolean checkKthBit(int n, int k) {
//         return ((n&(1<<k))!=0);
//     }
// }

// right shift
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return (((n>>k)&1)==1);
    }
}
