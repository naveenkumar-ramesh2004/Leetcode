// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/description/


/*class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){   //O(n^2)
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
                }
            }
        return max;
    }
}*/


/*
Prefix Sum + Greedy Reset Pattern

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}


/*
💡 Dry Run Example

For: nums = [-2,1,-3,4,-1,2,1,-5,4]

i	nums[i]	sum (current)	max
0	-2	-2	-2
1	1	max(1, -2+1)=1	1
2	-3	max(-3, 1-3)=-2	1
3	4	max(4, -2+4)=4	4
4	-1	max(-1, 4-1)=3	4
5	2	max(2, 3+2)=5	5
6	1	max(1, 5+1)=6	6
7	-5	max(-5, 6-5)=1	6
8	4	max(4, 1+4)=5	6

✅ Final answer: 6

*/

//Don't confuse that it is a follow up qution
//Print max sub array
/*
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
        //    sum=Math.max(nums[i],sum+nums[i]);
        if(nums[i]<sum+nums[i]){
            sum+=nums[i];
        }
        else{
            sum=nums[i];
            left=i;
        }
            // max=Math.max(max,sum);
            if(max<sum){
                max=sum;
                right=i;
            }
        }
        while(left<=right){
            System.out.print(nums[left++]+" ");
        }
        System.out.println();
        return max;
    }
}
*/
