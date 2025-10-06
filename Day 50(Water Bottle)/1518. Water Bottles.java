// 1518. Water Bottles
// https://leetcode.com/problems/water-bottles/description/?envType=daily-question&envId=2025-09-26

// class Solution {
//     public int numWaterBottles(int numBottles, int numExchange) {
//         int count=numBottles;
//         while(numBottles>=numExchange){
//             count+=numBottles/numExchange;
//             if(numBottles/numExchange==0){
//                 numBottles/=numExchange;
//             }
//             else{
//                 numBottles=(numBottles/numExchange)+(numBottles%numExchange);
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles/numExchange!=0){
            count+=numBottles/numExchange;
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
        }
        return count;
    }
}
