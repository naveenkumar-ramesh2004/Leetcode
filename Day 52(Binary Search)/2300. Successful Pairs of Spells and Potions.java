// 2300. Successful Pairs of Spells and Potions
// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=daily-question&envId=2025-09-26


class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length]; 
        Arrays.sort(potions);
        int i=0;
        for(int spell:spells){
            int idx=lowerBound(potions,(success+spell-1)/spell);
            ans[i++]=potions.length-idx;
        }
        return ans;
    }
         private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
