// 560. Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/description/


/*
Optimiseed Approch
from i to n
It handel both +ve and negative eg arr[1,-1,1] k=1  sum=1==k so,count=1, sum=0!=k,  sum=1==k,count=2 ans 2; 
time O(n^2);
Space O(1);
 */

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(k==sum){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }


/***
⚙️ Approach: Prefix Sum + HashMap
🔸 Step-by-Step Logic:

Use a running sum (sum) to store prefix sum.

Maintain a HashMap (prefixsum) to count how many times each prefix sum has occurred.

If we ever find that (sum - k) exists in the map,
it means there is a subarray ending at the current index whose sum = k.

Increase the count by map.get(sum - k) because there might be multiple subarrays giving that sum.

Finally, add/update the current sum in the map.

🧠 Key Concepts
Concept	Description
Prefix Sum	Sum of elements from start to current index
HashMap Usage	To store frequency of prefix sums
Condition Check	sum - k present in map → found a subarray
Initialization	map.put(0,1) handles subarrays starting from index 0
🧮 Example Dry Run

nums = [1, 2, 3], k = 3

Step	val	sum	sum-k	prefixsum(before)	count	prefixsum(after)
1	1	1	-2	{0=1}	0	{0=1, 1=1}
2	2	3	0	{0=1,1=1}	1 ✅	{0=1,1=1,3=1}
3	3	6	3	{0=1,1=1,3=1}	2 ✅	{0=1,1=1,3=1,6=1}

✅ Final count = 2

⏱️ Time Complexity

O(n) → Only one pass through the array

💾 Space Complexity

O(n) → For storing prefix sums in the HashMap
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixsum = new HashMap<>();
        int sum=0,count=0;
        prefixsum.put(0,1);
        for(int val:nums){
            sum+=val;
            if(prefixsum.containsKey(sum-k)){
                count+=prefixsum.get(sum-k);
            }
            prefixsum.put(sum,prefixsum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}


