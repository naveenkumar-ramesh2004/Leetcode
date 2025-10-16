// 3349. Adjacent Increasing Subarrays Detection I
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1) return true;
        for(int start=0;start+2*k-1 < nums.size();start++){
            boolean flag1 = true; boolean flag2= true;
            for(int i=start;i+1<start+k;i++){
                if(nums.get(i)>=nums.get(i+1)){
                    flag1 =false;
                    break;
                }
            }
            for(int j=start+k;j+1<start+2*k;j++){
                 if(nums.get(j)>=nums.get(j+1)){
                    flag2 =false;
                    break;
                }
            }
            if(flag1 && flag2){
                return true;
            }
        }
        return false;
    }
}
