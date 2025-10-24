// 229. Majority Element II
// https://leetcode.com/problems/majority-element-ii/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> ans =new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for(int val:nums){
            freq.put(val,freq.getOrDefault(val,0)+1);
            if(freq.get(val)>n && !ans.contains(val)){
                ans.add(val);
            }
        }
        return ans;
    }
}
