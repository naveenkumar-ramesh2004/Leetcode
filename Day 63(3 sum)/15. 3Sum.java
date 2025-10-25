// 15. 3Sum
// https://leetcode.com/problems/3sum/description/

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         findDistinct(nums[i],nums[j],nums[k],ans);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
//     void findDistinct(int a,int b,int c,List<List<Integer>> ans){
//         if(ans.size()==0){
//             ans.add(Arrays.asList(a,b,c));
//         }
//         else{
//             List<Integer> temp=Arrays.asList(a,b,c);
//             for(List<Integer> arr:ans){
//                 if(temp.equals(arr)){
//                     return;
//                 }
//             }
//             ans.add(temp);
//         }
//     }
// }


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> dublicate = new HashSet<>(); 
        for(int i=0;i<nums.length;i++){
            Set<Integer> hash = new HashSet<>();
            int j=i+1;
            while(j<nums.length){
                int k =-1*(nums[i]+nums[j]);
                if(hash.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],k);
                    temp.sort(null);
                    dublicate.add(temp);
                }
                else{
                    hash.add(nums[j]);
                }
                j++;
            }
        }
        List<List<Integer>> ans = new ArrayList<>(dublicate);
        return ans;
    }
}
