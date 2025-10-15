// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/





import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int colour[] = new int[3];
        for(int val:nums){
            colour[val]++;
        }
        /*
        int t=0,c=0;
        for(int length:colour){  // take the count of colour then add the color in the count 0 count add two 0 
            for(int i=0;i<length;i++){
                nums[t++]=c;
            }
            colour++;
        }
        */


        // optimized methos use if(colour[0]>0) add 0 elseif(colour[1]>0 add 1 else add 2)

        for(int i=0;i<nums.length;i++){
            if(colour[0]>0){
                nums[i]=0;
                colour[0]--;
            }
            else if(colour[1]>0){
                nums[i]=1;
                colour[1]--;
            }
            else{
                nums[i]=2;
            }
            
        }
        
    }
}
