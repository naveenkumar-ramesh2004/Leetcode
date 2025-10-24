// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans =new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows==1){
            return ans;
        }
        ans.add(Arrays.asList(1,1));
        if(numRows==2){
            return ans;
        }
        for(int i=1;i<numRows-1;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0;j<i;j++){
                 int sum=ans.get(i).get(j)+ans.get(i).get(j+1);
                 temp.add(sum);
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
