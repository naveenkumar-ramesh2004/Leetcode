// 136. Single Number
// https://leetcode.com/problems/single-number/description/


//HashMap => ans.add(val) o=if the val already there remove the val in "ans" after the loop there onle one value left return the value us "Iteration"=>Hashmap no index acess 


// class Solution {
//     public int singleNumber(int[] nums) {
//         Set<Integer> ans = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(!ans.add(nums[i])){
//                 ans.remove(nums[i]);
//             }
//         }
//         for(int answer:ans){
//             return answer;
//         }
//         return -1;
//     }
// }


// class Solution {
//     public int singleNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i=i+2){
//             if(nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return nums[nums.length-1];  // if nums.length=1 then return 0(first index) or  if the nums.length=odd the loop run successfuly then the last element is answer nums.length-1(last index)
//     }
// }


class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int val:nums){
            xor^=val;
        }
        return xor;
    }
    }
/*
When you XOR two same numbers, result = 0
Example → 5 ^ 5 = 0

When you XOR any number with 0, result = number
Example → 0 ^ 7 = 7

Because XOR removes pairs:

a ^ a = 0
a ^ 0 = a


So:

1 ^ 1 ^ 2 ^ 2 ^ 4
= (1 ^ 1) ^ (2 ^ 2) ^ 4
= 0 ^ 0 ^ 4
= 4


Step 1 → 0 ^ 4
  000
^ 100
------
  100  → 4


✅ ans = 4

Step 2 → 4 ^ 1
  100
^ 001
------
  101  → 5


✅ ans = 5

Step 3 → 5 ^ 2
  101
^ 010
------
  111  → 7


✅ ans = 7

Step 4 → 7 ^ 1
  111
^ 001
------
  110  → 6


✅ ans = 6

Step 5 → 6 ^ 2
  110
^ 010
------
  100  → 4


✅ ans = 4
*/
