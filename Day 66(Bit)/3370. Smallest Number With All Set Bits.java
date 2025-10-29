// 3370. Smallest Number With All Set Bits
// https://leetcode.com/problems/smallest-number-with-all-set-bits/description/?envType=daily-question&envId=2025-10-29


class Solution {
    public int smallestNumber(int n) {
        int bitelength=1;
        while(n>=bitelength){
            bitelength*=2;
        }
        return bitelength-1;
    }
}
