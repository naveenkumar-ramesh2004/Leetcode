// Longest Subarray with Sum K
// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1


//use hashmap
class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum=0,lengthsubarray=0;
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                lengthsubarray=Math.max(lengthsubarray,i+1);
            }
            if(hash.containsKey(sum-k)){
                lengthsubarray=Math.max(lengthsubarray,i-hash.get(sum-k));
            }
            if(!hash.containsKey(sum)){
            hash.put(sum,i);
            }
        }
        return lengthsubarray;
          
    }
}

/*
import java.util.*;
public class sumksubarray{
    public static void main(String[] args) {
        // int arr[]={1,1,2,-1,1,1,1};
        int arr[]={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(brute(arr,k));
        System.out.print(optimal(arr,k));
    }
    static int brute(int[] arr,int k){
        int max=0;
        // for(int i=0;i<arr.length;i++){    //O(n^3)
        //     for(int j=i;j<arr.length;j++){
        //         int sum=0;
        //         int count=0;
        //         for(int t=i;t<=j;t++){
        //             sum+=arr[t];
        //             count++;
        //     }
        //     if(sum==k){
        //         max=Math.max(max,count);
        //         }
        //     }
        // }
        for(int i=0;i<arr.length;i++){   //O(n^2)
            int sum=0;
            int count=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                count++;
                if(sum==k){
                max=Math.max(max,count);
                }
            }
        }
        return max;
    }
    static int optimal(int[] arr,int k){   //O(n) only the array have +ve only
        int i=0,j=0;
        int sum=0,lengthOfMaxSubAraay=0;
        while(i<=j && j<arr.length){
            sum+=arr[j];
            if(sum == k){
                lengthOfMaxSubAraay=Math.max(lengthOfMaxSubAraay,j-i+1);
            }
            while(sum>k){
                sum-=arr[i++];
                System.out.println("sum: "+sum);
            }
            j++;
            
        }
        return lengthOfMaxSubAraay;
    }
}
*/
