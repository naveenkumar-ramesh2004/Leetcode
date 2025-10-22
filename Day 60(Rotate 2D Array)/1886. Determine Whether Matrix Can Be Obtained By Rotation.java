// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

//Rotate the array 4 time (orginal=0',90',180',270',360'=orginal=0') check each rotation is eaual to target return true after all rotate return false;

//TIME complexity is O(4)=>Four rotation * O(n^2) rotate the array 90' =>O(4*n^2) =>O(n^2) remove constant.
// Space O(1).

class Solution {
    int len;
    public boolean findRotation(int[][] matrix, int[][] target) {
        this.len=matrix.length;
        int n=4;
        while(n>0){
            rotate(matrix);
            if(Arrays.deepEquals(matrix,target)){
                return true;
            }
            n--;
        }
        return false;
    }
    void rotate(int[][] matrix){
        for(int i=0;i<len/2;i++){
            int[] temp = matrix[i];
            matrix[i]=matrix[len-1-i];
            matrix[len-1-i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int k = matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i] = k;
            }
        }
    }
}
