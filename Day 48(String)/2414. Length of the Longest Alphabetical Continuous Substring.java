//2414. Length of the Longest Alphabetical Continuous Substring
//https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/description/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    }
                count=0;
            }
        }
        return (max<count)?count:max;
        
    }
}
