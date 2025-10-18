// 2149. Rearrange Array Elements by Sign

//Brute force Approch use Two array
// 1.array store postive 
//2.array strore Negative

//Answer Store one postive value and one negative value

//Time complexity O(n) for seprate +ve and -ve answer store O(n) Time complexity is O(2n)
//space complexity is use two array size of N so = O(n)




//Optimized approch
//if val is positive store in even postion("even index =>0,2,4,....") else -ve("odd index =>1,2,3,..") 

//Time complexity is O(n) space is O(n);

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]= new int[nums.length];
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>0){
                ans[pos]=val;
                pos+=2;
                
            }
            else{
                ans[neg]=val;
                neg+=2;
            }
        }
        return ans;
    }
}

