//189. Rotate Array
//https://leetcode.com/problems/rotate-array/description/

//1.Brute force way("In-place" swap without use another array)


// The actual trick comes when trying to solve this problem without using any additional memory. This means you need to use the original array somehow to move the elements around. Now, we can place each element in its original location and shift all the elements around it to adjust as that would be too costly and most likely will time out on larger input arrays.


// class Solution {
//     public void rotate(int[] nums, int k) {
//         k=k%nums.length;
//         for(int i=0;i<k;i++){
//             int swapval=nums[nums.length-1];
//             for(int j=nums.length-1;j>0;j--){
//                 nums[j]=nums[j-1];
//             }
//             nums[0]=swapval;
//         }
//     }
// }


//2. Brute force Way (New array)

// The easiest solution would use additional memory and that is perfectly fine.



//3. Reverse 0 to n-k then n-k to n arr=[1,2,3,4,5,6,7] k=3 reverse=[4,3,2,1,5,6,7] 2nd reverse=[4,3,2,1,7,6,5] then reverse 0 to n reverse =[5,6,7,1,2,3,4]

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
