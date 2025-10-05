// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/description/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Set<Integer> arr= new HashSet<>();
        for(int val:nums){
            arr.add(val);
        }
        int count=1,max=1;
        for(int val:arr){
            if(!arr.contains(val-1)){
                count=1;
                while(arr.contains(++val)){
                    count++; 
                }
                max=Math.max(max,count);
            }
            
        }
        return max;
    }
}
