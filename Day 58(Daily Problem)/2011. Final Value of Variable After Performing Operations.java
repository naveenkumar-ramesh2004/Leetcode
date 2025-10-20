// 2011. Final Value of Variable After Performing Operations

// class Solution {
//     public int finalValueAfterOperations(String[] operations) {
//         int x=0;
//         for(String operation:operations){
//             switch(operation){
//                 case "--X":
//                 --x;
//                 break;
//                 case "X--":
//                 x--;
//                 break;
//                 case "X++":
//                 x++;
//                 break;
//                 default:
//                 ++x;
//             }
//         }
//         return x;
//     }
// }

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation:operations){
            if(operation.contains("+")){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}
