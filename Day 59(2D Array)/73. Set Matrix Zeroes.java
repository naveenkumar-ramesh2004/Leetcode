// 73. Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/description/



class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> zero=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zero.add(new int[]{i,j});
                }
            }
        }
        for(int arr[]:zero){
            setzero(matrix,arr[0],arr[1]);
        }
    }
    void setzero(int[][] matrix,int row,int col){
        int i=0;
        while(i<matrix[row].length){
            matrix[row][i++]=0;
        }
        i=0;
        while(i<matrix.length){
            matrix[i++][col]=0;
        }
    }
}



// optimize way 
/*
class Solution {
    public void setZeroes(int[][] matrix) {
          int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        // Step 1: Mark rows and columns that contain zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Update matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}*/
