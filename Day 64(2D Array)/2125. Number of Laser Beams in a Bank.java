// 2125. Number of Laser Beams in a Bank
// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2025-10-27


class Solution {
    public int numberOfBeams(String[] bank) {
        int arr[] = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            arr[i]=count;
        }
        int ans=0,prev=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans+=(prev*arr[i]);
                prev=arr[i];
            }
        }
        return ans;
    }
}
