// 1716. Calculate Money in Leetcode Bank
// https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2025-10-25


class Solution {
    public int totalMoney(int n) {
         int sum=0;
        int count=1;
        int c=2;
        for(int i=1;i<=n;i++){

            sum+=count;
            count++;
            if(i%7==0){
                count=c;
                c++;
            }
        }
        return sum;

    }
}
