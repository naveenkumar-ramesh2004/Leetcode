//2221. Find Triangular Sum of an Array
//https://leetcode.com/problems/find-triangular-sum-of-an-array/description/?envType=daily-question&envId=2025-09-26


class Solution {
    public int triangularSum(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}
