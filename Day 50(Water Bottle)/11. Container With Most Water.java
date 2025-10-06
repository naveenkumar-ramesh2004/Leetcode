// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/?envType=daily-question&envId=2025-09-26

//If you simulate the problem, it will be O(n^2) which is not efficient.

// class Solution {
//     public int maxArea(int[] height) {
//         // int i=0,j=height.length-1;
//         int max=0;
//         for(int i=0;i<height.length-1;i++){
//             for(int j=i+1;j<height.length;j++){
//                 max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
//             }
//         }
//         return max;

//     }
// }

// two pointer lower hight deside the volue so move lower height

class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
                if(height[i]<height[j]){
                    i++;
                }
                else{
                    j--;
                }
        }
        
        return max;

    }

}
