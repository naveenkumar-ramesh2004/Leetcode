// 3100. Water Bottles II
//https://leetcode.com/problems/water-bottles-ii/description/?envType=daily-question&envId=2025-09-26


// class Solution {
//     public int maxBottlesDrunk(int numBottles, int numExchange) {
//         int ans=numBottles;  //initial dring
//         int count = 0; // filled bottle after exchange
//         while(numBottles>=numExchange){
//             numBottles-=numExchange++;  // empty bottle
//             count++;                    //count exchange bottle
//             if(numBottles<numExchange){  // if empty bottle < no of bottle exchage
//                 ans+=count;           // add exchange bottle    
//                 numBottles+=count;// add exchange bottle to empty bottle coz full bottle also after drink is empty 
//                 count=0;  // set exchange bottle is zero coz it add to result
//             }
//         }
//         return ans;
//     }
// }



class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles; // no of bottle drink
        
        while(numBottles>=numExchange){ //if empty >= exchange
            numBottles-=numExchange++; // empty=empty-exchange;
            ans++;
            numBottles++;  //empty++ coz full bottle++ so after drink one full bottle empty++;
        }
        return ans;
    }
}
